package net.konic.grandHotel;

import java.util.Scanner;

public class GuestRegistration {

	private String name;
	private String phone;

	public GuestRegistration(String n, String p) {

		this.name = n;
		this.phone = p;

		if (phone.length() == 10) {
			
			System.out.println("Name: " + n);
			System.out.println("Phone: " + p);
			System.out.println("Guest Registered Successfully");
		} else {
			System.out.println("Invalid Phone Number.");
		}
	}

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);

		System.out.println("Enter guest name : ");
		String name = scr.nextLine();
		System.out.println("Enter Phone number : ");
		String phone = scr.next();
		GuestRegistration obj = new GuestRegistration(name, phone);

		scr.close();
	}

}
