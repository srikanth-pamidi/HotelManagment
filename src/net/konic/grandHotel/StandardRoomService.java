package net.konic.grandHotel;

public class StandardRoomService extends RoomService {

    
    void provideService() {
        System.out.println("Providing Standard Room Service.");
    }

    public static void main(String[] args) {

     
        RoomService service = new StandardRoomService();

        service.provideService(); 
    }
}

