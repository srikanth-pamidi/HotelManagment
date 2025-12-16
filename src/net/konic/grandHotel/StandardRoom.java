package net.konic.grandHotel;

public class StandardRoom extends RoomServices {

	
	@Override
	public void bookRoom() {
		System.out.println("Standerd Room Booked.");

	}

	@Override
	public int Price() {
		System.out.println("Price per day 2000.00rs");
		return 2000;
	}
	public static void main(String[] args) {
		 RoomServices room = new StandardRoom(); // abstraction + inheritance
	        room.bookRoom();
	        room.Price();
	}
}
