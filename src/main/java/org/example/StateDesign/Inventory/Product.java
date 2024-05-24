package org.example.StateDesign.Inventory;

public class Product {

    private String name;
    private int id;
    private double price;

    public Product(String name, int productId, double price) {
        this.name = name;
        this.id = productId;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
