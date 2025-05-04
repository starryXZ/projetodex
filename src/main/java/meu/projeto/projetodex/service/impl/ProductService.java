package meu.projeto.projetodex.service.impl;

import domain.model.Product;


public interface ProductService {

        Product findById(Long id);

        Product create(Product productToCreate);
}
