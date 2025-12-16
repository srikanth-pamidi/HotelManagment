package net.konic.grandHotel;

public class AccesModifiersCheck {

	    public String name = "Srikanth";        
	    protected String role = "Guest";     
	    String type = "Visitor";             
	    private int pin = 1234;        

	   
	    void accessTest() {
	        System.out.println("Public Access: Allowed");
	        System.out.println("Protected Access: Allowed");
	        System.out.println("Default Access: Allowed");
	        System.out.println("Private Access: Not Allowed");
	    }
	

	

	    public static void main(String[] args) {

	    	AccesModifiersCheck obj = new AccesModifiersCheck();
	        obj.accessTest();
	    }
	}



