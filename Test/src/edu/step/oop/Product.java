package edu.step.oop;


public class Product {
    private int productId;
    private String name;
    private double price;
    private int quantity;

 
    public Product(int productId) {
        this.productId = productId;
    }

    public Product(int productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

   
    public double getPrice() {
        return price;
    }

    
    public void updateQuantity(int newQuantity) {
        if (newQuantity >= 0) {
            this.quantity = newQuantity;
            System.out.println("Cantitate actualizată cu succes: " + newQuantity);
        } else {
            System.out.println("Cantitatea introdusă trebuie să fie un număr pozitiv.");
        }
    }

    public static void main(String[] args) {
        Product product1 = new Product(1, "Laptop", 1500.0, 10);
        System.out.println("Prețul produsului: " + product1.getPrice() + " RON");
        product1.updateQuantity(15);
    }
}
