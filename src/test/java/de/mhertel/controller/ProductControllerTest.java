package de.mhertel.controller;

import de.mhertel.domain.Product;
import de.mhertel.service.ProductService;
import de.mhertel.utility.ProductNotFoundException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.*;

/**
 * Created by matthias on 13.05.17.
 */
public class ProductControllerTest {

    @Mock
    ProductService productService;
    @Mock
    BindingResult result;
    @Mock
    MockHttpServletRequest request = new MockHttpServletRequest();
    @InjectMocks
    ProductController productController;
    @Spy
    List<Product> products = new ArrayList<>();
    @Spy
    ModelMap model;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        products = getProductList();
    }

    /**
     * Seeding some dummy-Data for tests.
     */
    public List<Product> getProductList(){
        Product p1 = new Product();
        p1.setId(new Long(1));
        p1.setTitle("Title1");
        p1.setCategory("Category1");
        p1.setDescription("description");
        p1.setShippingWeight(20);
        p1.setListPrice(20.0);
        p1.setActive(true);
        p1.setInStockNumber(20);

        Product p2 = new Product();
        p2.setId(new Long(2));
        p2.setTitle("Title2");
        p2.setCategory("Category2");
        p2.setDescription("description");
        p2.setShippingWeight(20);
        p2.setListPrice(20.0);
        p2.setActive(true);
        p2.setInStockNumber(20);

        Product p33 = new Product();
        p33.setId(new Long(33));
        p33.setTitle("Title33");
        p33.setCategory("Category33");
        p33.setDescription("description");
        p33.setShippingWeight(330);
        p33.setListPrice(330.0);
        p33.setActive(true);
        p33.setInStockNumber(330);

        products.add(p1);
        products.add(p2);
        products.add(p33);
        return products;
    }


    /**
     * Test method - list all existing products.
     * @throws Exception
     */
    @Test
    public void listProducts() throws Exception {
        when(productService.findAll()).thenReturn(products);
        Assert.assertEquals(productController.listProducts(model), "product/list");
        Assert.assertEquals(model.get("productList").toString(), products.toString());
        verify(productService, atLeastOnce()).findAll();
    }

    /**
     * Test method - get addProduct-View-Form.
     * @throws Exception
     */
    @Test
    public void addProduct() throws Exception {
        Assert.assertEquals(productController.addProduct(model), "product/add");
        Assert.assertNotNull(model.get("product"));
//        Assert.assertFalse((Boolean)model.get("edit"));
//        Assert.assertEquals(((Product)model.get("employee")).getId(), 0);
    }

    /**
     * Test method - post addProduct-View-Form.
     * @throws Exception
     */
    @Test
    public void addProductPost() throws Exception {

    }

    /**
     * Test method - get expected Exception (product not found)
     * @throws Exception
     */
    @Test(expected = ProductNotFoundException.class)
    public void productDetail() throws Exception {
        productController.productDetail(new Long(34), model);
    }

    /**
     * Test method - get editProduct-View-Form.
     * @throws Exception
     */
    @Test
    public void updateProduct() throws Exception {

    }

    /**
     * Test method - post editProduct-View-Form.
     * @throws Exception
     */
    @Test
    public void updateProductPost() throws Exception {
        when(result.hasErrors()).thenReturn(false);
        doNothing().when(productService).updateProduct(any(Product.class));
        Assert.assertEquals(productController.updateProductPost(products.get(2), model), "redirect:/products/detail?id=1");
        Assert.assertEquals(model.get("success"), "Product Title1 updated successfully");
    }

    /**
     * Test method - removeProduct
     * @throws Exception
     */
    @Test
    public void removeProduct() throws Exception {
        doNothing().when(productService).removeOne(anyLong());
        Assert.assertEquals(productController.removeProduct("123456782343", model), "redirect:/products/list");
    }




}