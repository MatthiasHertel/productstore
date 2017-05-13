package de.mhertel.repository;

import de.mhertel.domain.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by matthias on 13.05.17.
 */
public interface ProductRepository extends CrudRepository<Product, Long> {

}