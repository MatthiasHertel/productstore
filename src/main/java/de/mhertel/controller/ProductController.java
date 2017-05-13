package de.mhertel.controller;

import de.mhertel.domain.Product;
import de.mhertel.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
}
