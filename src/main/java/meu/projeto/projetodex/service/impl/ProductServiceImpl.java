package meu.projeto.projetodex.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import domain.model.Product;
import domain.model.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
    // Implementação dos métodos do ProductService
    // Aqui você pode adicionar a lógica de negócios relacionada aos produtos
    // Por exemplo, métodos para criar, atualizar, excluir e buscar produtos

    private  final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product findById(Long id) {
        // Lógica para encontrar um produto pelo ID
            return productRepository.findById(id).orElseThrow(NoSuchElementException::new);
        // Retorne o produto encontrado ou null se não encontrado
    }
    @Override
    public Product create(Product productToCreate) {
        // Lógica para criar um novo produto
        return productRepository.save(productToCreate);
        // Retorne o produto criado
    }

}
