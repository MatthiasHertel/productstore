package de.mhertel.controller;

import de.mhertel.domain.Product;
import de.mhertel.service.ProductService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by matthias on 13.05.17.
 */

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/list" , method = RequestMethod.GET)
    public String getAll(ModelMap model) {
        List<Product> productList = productService.findAll();
        model.addAttribute("productList", productList);
        return ("product/getAll");
    }


    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addProduct(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
        return "product/add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addProductPost(@ModelAttribute("product") Product product, HttpServletRequest request) {
        productService.save(product);


        return "redirect:/products/list";
    }

    @RequestMapping("/detail")
    public String productInfo(@RequestParam("id") Long id, Model model) {
        Product product = productService.findOne(id);
        model.addAttribute("product", product);

        return "product/detail";
    }

    @RequestMapping("/update")
    public String updateProduct(@RequestParam("id") Long id, Model model) {
        Product product = productService.findOne(id);
        model.addAttribute("product", product);

        return "product/update";
    }

    @RequestMapping(value="/update", method=RequestMethod.POST)
    public String updateProductPost(@ModelAttribute("product") Product product, HttpServletRequest request) {
        productService.save(product);


        return "redirect:/product/detail?id="+ product.getId();
    }
}
