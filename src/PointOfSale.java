/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tharindu Dhananjaya
 */
    
import java.util.ArrayList;
import java.util.List;

public class PointOfSale {
    private List<Product> products;
    private List<Product> cart;

    public PointOfSale() {
        products = new ArrayList<>();
        cart = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addToCart(String productName) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(productName)) {
                cart.add(product);
                break;
            }
        }
    }

    public void removeFromCart(String productName) {
        for (Product product : cart) {
            if (product.getName().equalsIgnoreCase(productName)) {
                cart.remove(product);
                break;
            }
        }
    }

    public double getTotal() {
        double total = 0;
        for (Product product : cart) {
            total += product.getPrice();
        }
        return total;
    }

    public void printCart() {
        for (Product product : cart) {
            System.out.println(product.getName() + " - Rs." + product.getPrice());
        }
        System.out.println("Total: Rs." + getTotal());
    }
}
   