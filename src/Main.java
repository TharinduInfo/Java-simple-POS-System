/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tharindu Dhananjaya
 */

public class Main {
    public static void main(String[] args) {
        PointOfSale pos = new PointOfSale();

        pos.addProduct(new Product("Product 1", 10.0));
        pos.addProduct(new Product("Product 2", 20.0));
        pos.addProduct(new Product("Product 3", 30.0));

        pos.addToCart("Product 1");
        pos.addToCart("Product 2");
        pos.addToCart("Product 3");

        pos.printCart();
    }
}