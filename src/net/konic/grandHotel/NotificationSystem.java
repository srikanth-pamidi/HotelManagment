package net.konic.grandHotel;


	import java.util.Scanner;

	public class NotificationSystem {

	  
	    interface Notifier {
	        void send();
	    }

	 
	  public  static class SMSNotifier implements Notifier {
	       
	        public void send() {
	            System.out.println("SMS Notification Sent");
	        }
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Send Notification via: ");
	        String mode = sc.nextLine();  

	        Notifier obj = new SMSNotifier();
	        obj.send();

	        sc.close();
	    }
	}



