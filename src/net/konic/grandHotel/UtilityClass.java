package net.konic.grandHotel;

public class UtilityClass {

	private static int bookingCounter = 1000;

	public static String generateBookingId() {
		bookingCounter++;
		return "KGH" + bookingCounter;
	}

	public static void main(String[] args) {

		System.out.println("Booking ID: " + UtilityClass.generateBookingId());
	}
}
