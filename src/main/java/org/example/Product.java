package org.example;

import java.util.Scanner;

public class Product extends Money {
    public int priceWhole; // цена в рублях.
    public int pricePennies; // цена в копейках.
    private int countWhole ; // итоговая сумма в рублях.
    private int countPennies ; // итоговая сумма в копейках.
    public int getPriceWhole() {
        return priceWhole;
    }

    public void setPriceWhole() {
        this.priceWhole = priceWhole;
    }

    public int getPricePennies() {
        return pricePennies;
    }

    public void setPricePennies() {
        this.pricePennies = pricePennies;
    }

    public int getCountWhole() {
        return countWhole;
    }

    public void setCountWhole() {
        this.countWhole = countWhole;
    }

    public int getCountPennies() {
        return countPennies;
    }

    public void setCountPennies() {
        this.countPennies = countPennies;
    }

    public Product() {
        this.priceWhole = priceWhole;
        this.pricePennies = pricePennies;
        this.countWhole = countWhole;
        this.countPennies = countPennies;
    }

    public void fillingProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the cost of the goods in rubles:");
        priceWhole = scanner.nextInt();
        System.out.println("Enter the cost of the goods in kopecks:");
        pricePennies = scanner.nextInt();
        scanner.close();
    }

    public void showProduct() {
        System.out.println("Product cost:");
        System.out.println(priceWhole + " rubles " + pricePennies + " kopecks.");
    }

    public void countResult() {
        countWhole = priceWhole - whole;
        countPennies = pricePennies - pennies;
    }

    public void showResult() {
        System.out.println("The cost of the goods minus your amount:");
        System.out.println(countWhole + " rubles " + countPennies + " kopecks.");
    }
}
