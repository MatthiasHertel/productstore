package de.mhertel.service.impl;

import de.mhertel.domain.Product;
import de.mhertel.repository.ProductRepository;
import de.mhertel.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by matthias on 13.05.17.
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public void saveProduct(Product product) {
        productRepository.save(product);
    };

    public void updateProduct(Product product) {
        Product entity = productRepository.findOne(product.getId());
        if(entity!=null){
            entity.setTitle(product.getTitle());
            entity.setDescription(product.getDescription());
            entity.setCategory(product.getCategory());
            entity.setInStockNumber(product.getInStockNumber());
            entity.setListPrice(product.getListPrice());
            entity.setShippingWeight(product.getShippingWeight());


        }
        productRepository.save(product);
    };

    public List<Product> findAll() {
        return (List<Product>) productRepository.findAll();
    }

    public Product findOne(Long id) {
        return productRepository.findOne(id);
    }

    public void removeOne(Long id) {
        productRepository.delete(id);
    }
}
