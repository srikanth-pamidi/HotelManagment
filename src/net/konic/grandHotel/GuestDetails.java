package net.konic.grandHotel;

class PersonDetails {

    String name;
    String role;

    PersonDetails(String name, String role) {
        this.name = name;
        this.role = role;
    }

    void details() {
        System.out.println("Person Name: " + name);
        System.out.println("Role: " + role);
    }
}

// 👇 THIS MUST BE PUBLIC
public class GuestDetails extends PersonDetails {

    GuestDetails(String name) {
        super(name, "Guest");
    }

    public static void main(String[] args) {
        PersonDetails obj = new GuestDetails("Srikanth");
        obj.details();
    }
}
