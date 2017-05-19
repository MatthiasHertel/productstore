package de.mhertel.controller;

import de.mhertel.domain.Product;
import de.mhertel.service.ProductService;
import de.mhertel.utility.ProductNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
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

    /**
     * This method will list all existing products.
     *
     * @param model
     * @return route to View with all Products TODO pagination
     */
    @RequestMapping(value = "/list" , method = RequestMethod.GET)
    public String listProducts(ModelMap model) {

        List<Product> productList = productService.findAll();
        model.addAttribute("productList", productList);

        return ("product/list");
    }

    /**
     * This method will provide the medium to add a new product.
     *
     * @param model
     * @return route to View with Form for Product TODO DRY - use one form for create/update
     */
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addProduct(ModelMap model) {

        Product product = new Product();
        model.addAttribute("product", product);
        model.addAttribute("edit", false);
        return "product/add";
    }

    /**
     * This method will be called on form submission, handling POST request for saving product in database.
     * TODO validate the user input
     * @param product
     * @param result
     * @param model
     * @return redirect to View with all Products
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addProductPost(@ModelAttribute("product") Product product, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "product/list";
        }
        productService.save(product);
        model.addAttribute("success", "Product " + product.getTitle() + " created successfully");
        return "redirect:/products/list";
    }

    /**
     * @param id
     * @param model
     * @return route to View with the product (Single)
     * @throws Exception
     */
    @RequestMapping("/detail")
    public String productDetail(@RequestParam("id") Long id, ModelMap model) throws Exception{

        Product product = productService.findOne(new Long(id));
        if (product == null) throw new ProductNotFoundException();
        model.addAttribute("product", product);

        return "product/detail";
    }

    /**
     * This method will provide the medium to update an existing product.
     *
     * @param id
     * @param model
     * @return route to View with Form for Product TODO DRY - use one form for create/update
     */
    @RequestMapping("/update")
    public String updateProduct(@RequestParam("id") Long id, ModelMap model) {

        Product product = productService.findOne(id);
        model.addAttribute("product", product);
        model.addAttribute("edit", true);
        return "product/update";
    }

    /**
     * This method will be called on form submission, handling POST request for updating product in database.
     *
     * @param product
     * @param model
     * @return redirect to View the Product (Single)
     */
    @RequestMapping(value="/update", method=RequestMethod.POST)
    public String updateProductPost(@ModelAttribute("product") Product product, ModelMap model) {

        productService.updateProduct(product);
        model.addAttribute("success", "Product " + product.getTitle()	+ " updated successfully");

        return "redirect:/products/detail?id="+ product.getId();
    }

    /**
     * This method will delete a Product by it's Id value.
     *
     * @param id
     * @param model
     * @return redirect to View with all Products
     */
    @RequestMapping(value="/remove", method=RequestMethod.POST)
    public String removeProduct(@ModelAttribute("id") String id, ModelMap model) {

        productService.removeOne(Long.parseLong(id));
        List<Product> productList = productService.findAll();
        model.addAttribute("productList", productList);

        return "redirect:/products/list";
    }
}
