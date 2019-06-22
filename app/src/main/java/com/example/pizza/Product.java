package com.example.pizza;

public class Product {
    private int id;
    private String title;
    private double price;
    private int image;



    public Product(int image, String title,double price, int id) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }




    public double getPrice() {
        return price;
    }

    public int getImage() {
        return image;
    }


}
