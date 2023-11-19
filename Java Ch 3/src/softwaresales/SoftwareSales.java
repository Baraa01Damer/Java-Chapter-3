package softwaresales;

import java.util.Scanner;

public class SoftwareSales {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int amount = 0;
        double gross = 0.00;
        double discountP = 0.00;
        double total = 0.00;
        double discount = 0;

        System.out.print("Purchase amount: ");
        amount = input.nextInt();

        if (amount >= 10 && amount <= 19) {
            discount = .2;
            System.out.println("20% discount awarded.");
            
        } else if (amount >= 20 && amount <= 49) {
            discount = .3;
            System.out.println("30% discount awarded.");
            
        } else if (amount >= 50 && amount <= 99) {
            discount = .4;
            System.out.println("40% discount awarded.");
            
        } else if (amount >= 100) {
            discount = .5;
            System.out.println("50% discount awarded.");
            
        }

        gross = amount * 99;
        discountP = discount * gross;
        total = gross - discountP;
        System.out.printf("The total is %.2f", total);

    }
}