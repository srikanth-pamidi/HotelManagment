package net.konic.grandHotel;

import java.util.Scanner;


interface Payment {
 void pay(int amount);
}


public class PaymentProcessing implements Payment {


 public void pay(int amount) {
     System.out.println("Payment Successful using UPI");
     System.out.println("Amount Paid: " +amount);
 }

 public class CashPayment implements Payment {

	  
	    public void pay(int amount) {
	        System.out.println("Payment Successful using CASH");
	        System.out.println("Amount Paid: " + amount);
	    }
	}
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.print("Select Payment Mode: ");
     String mode = sc.nextLine();   

     int amount = 4720;

     Payment payment = new PaymentProcessing(); 
     payment.pay(amount);

     sc.close();
 }
}
