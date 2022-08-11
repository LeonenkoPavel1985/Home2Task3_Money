package org.example;

import java.util.Scanner;

public class Money {
    public int whole; // целая часть денег.
    public int pennies; // копейки.

    public int setWhole() {
        return whole;
    }

    public void setWhole(int whole) {
        this.whole = whole;
    }

    public int getPennies() {
        return pennies;
    }

    public void setPennies() {
        this.pennies = pennies;
    }
    public Money() {
        this.whole = whole;
        this.pennies = pennies;
    }

    public void fillingMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount in rubles:");
        whole = scanner.nextInt();
        System.out.println("Enter the amount in kopecks:");
        pennies = scanner.nextInt();
    }

    void showMoney() {
        System.out.println("Your money:");
        System.out.println(whole + " rubles " + pennies + " kopecks.");
    }
}
