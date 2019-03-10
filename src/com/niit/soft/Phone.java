package com.niit.soft;

public class Phone {
    private String brand;
    private String color;
    private Integer price;
    public Phone() {
    }
    public Phone(String brand, String color, Integer price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
