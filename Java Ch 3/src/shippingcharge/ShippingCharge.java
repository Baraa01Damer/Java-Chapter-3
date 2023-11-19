package shippingcharge;

import java.util.Scanner;           

public class ShippingCharge {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double wght;
        int mi;
        double charge;

        System.out.print("Enter the weight of the parcel: ");
        wght=input.nextDouble();

        System.out.print("Enter the miles shipped: ");
        mi=input.nextInt();

        if (wght <= 2)
        {
            charge=(1.10+(mi/500));
            System.out.printf("The shipping charges are $%.2f", charge);
        }

        else if (wght >2 && wght <=6)
        {
            charge=(2.20+(mi/500));
            System.out.printf("The shipping charges are $%.2f", charge);
        }

        else if (wght >6 && wght <=10)
        {
            charge=(3.70+(mi/500));
            System.out.printf("The shipping charges are $%.2f", charge);
        }

        else if (wght > 10)
        {
            charge=(3.80+(mi/500));
            System.out.printf("The shipping charges are $%.2f", charge);
        }

    }
}