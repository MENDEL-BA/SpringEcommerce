package com.ecommerce.microcommerce.dao;

import com.ecommerce.microcommerce.model.Product;

import java.util.List;

// data acces Object
public interface ProductDao {
    List<Product> findAll();
    Product findById(int id);
    Product save(Product p);
}
