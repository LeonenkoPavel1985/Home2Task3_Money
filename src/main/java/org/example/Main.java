package org.example;
public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Money money = new Money();
        money.fillingMoney();
        money.showMoney();
        System.out.println("--------------------------------------");
        Product product = new Product();
        product.fillingProduct();
        product.showProduct();
        System.out.println("--------------------------------------");
        product.countResult();
        product.showResult();
    }
}