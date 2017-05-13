package de.mhertel.service;

import de.mhertel.domain.Product;

import java.util.List;

/**
 * Created by matthias on 13.05.17.
 */
public interface ProductService {

    Product save(Product product);

    List<Product> findAll();

    Product findOne(Long id);

    void removeOne(Long id);
}
