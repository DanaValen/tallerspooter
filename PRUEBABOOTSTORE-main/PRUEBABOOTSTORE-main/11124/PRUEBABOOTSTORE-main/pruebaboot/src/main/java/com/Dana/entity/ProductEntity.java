package com.anyi.entity;


import java.util.UUID;

public class ProductEntity {


    private UUID id;           // Identificador único del producto


    private String name;       // Nombre del producto


    private String category;   // Categoría del producto (Ej. "Ropa", "Accesorios")


    private String size;       // Talla del producto (Ej. "S", "M", "L")


    private String material;   // Material del producto (Ej. "Algodón", "Poliéster")


    private double price;      // Precio del producto


    private int stock;         // Cantidad en stock

    // Constructor vacío requerido por JPA
    public ProductEntity() {}

    // Constructor con parámetros
    public ProductEntity(String name, String category, String size, String material, double price, int stock) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.category = category;
        this.size = size;
        this.material = material;
        this.price = price;
        this.stock = stock;
    }

    // Getters y Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

}
