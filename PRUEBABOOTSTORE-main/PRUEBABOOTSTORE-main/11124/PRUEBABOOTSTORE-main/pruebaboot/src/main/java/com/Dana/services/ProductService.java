package com.anyi.services;

import com.anyi.entity.ProductEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductService {
    private final List<ProductEntity> products;

    // Constructor
    public ProductService() {
        products = new ArrayList<>();
        // Inicializando algunos productos de ejemplo
        products.add(new ProductEntity("Sweater", "Ropa", "M", "Algodón", 25.00, 20));
        products.add(new ProductEntity("Chaqueta impermeable", "Ropa", "L", "Poliéster", 40.00, 10));
        products.add(new ProductEntity("Collar elegante", "Accesorios", "M", "Cuero", 15.00, 30));
    }

    // Metodo para obtener todos los productos
    public List<ProductEntity> getAllProducts() {
        return new ArrayList<>(products);
    }

    // Metodo para obtener un producto por su ID
    public Optional<ProductEntity> getProductById(UUID id) {
        return products.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst();
    }

    // Metodo para agregar un nuevo producto
    public ProductEntity createProduct(ProductEntity product) {
        product.setId(UUID.randomUUID()); // Generar un nuevo ID
        products.add(product);
        return product;
    }

    // Metodo para actualizar un producto existente
    public Optional<ProductEntity> updateProduct(UUID id, ProductEntity updatedProduct) {
        return getProductById(id).map(existingProduct -> {
            existingProduct.setName(updatedProduct.getName());
            existingProduct.setCategory(updatedProduct.getCategory());
            existingProduct.setSize(updatedProduct.getSize());
            existingProduct.setMaterial(updatedProduct.getMaterial());
            existingProduct.setPrice(updatedProduct.getPrice());
            existingProduct.setStock(updatedProduct.getStock());
            return existingProduct;
        });
    }

    // Metodo para eliminar un producto por su ID
    public boolean deleteProduct(UUID id) {
        return products.removeIf(product -> product.getId().equals(id));
    }
}
