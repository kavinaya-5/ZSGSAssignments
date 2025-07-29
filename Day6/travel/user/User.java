package user;

import booking.Ticket;

public class User {
    private String name;
    private String phone;

    public User(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public void bookTicket() {
        Ticket ticket = new Ticket(101, "Chennai", 750.0);
        System.out.println("User: " + name + ", Phone: " + phone);
        System.out.println("Ticket ID: " + ticket.getTicketId());
        System.out.println("Destination: " + ticket.getDestination());
        System.out.println("Fare: " + ticket.getFare());
    }
}
