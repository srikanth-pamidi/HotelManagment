package net.konic.grandHotel;

import java.util.Scanner;

public class BillingCalculator {

   
    public static final double TAX_RATE = 0.18;

    
    public static void calculateBill(int days) {

        int PerDay = 2000;
        int roomCharge = PerDay * days;
        double tax = roomCharge * TAX_RATE;
        double total = roomCharge + tax;

        System.out.println("Room Charge: " + roomCharge);
        System.out.println("Tax (18%): " +tax);
        System.out.println("Total Bill: " +total);
    }

    public static void main(String[] args) {
    	BillingCalculator obj = new BillingCalculator();
    	

        Scanner sc = new Scanner(System.in);

        System.out.print("Number of Days: ");
        int days = sc.nextInt();
        BillingCalculator.calculateBill(days);
        
      

        sc.close();
    }
}
