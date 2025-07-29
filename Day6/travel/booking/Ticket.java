package booking;

public class Ticket {
    private int ticketId;
    private String destination;
    private double fare;

    public Ticket(int ticketId, String destination, double fare) {
        this.ticketId = ticketId;
        this.destination = destination;
        this.fare = fare;
    }

    public int getTicketId() {
        return ticketId;
    }

    public String getDestination() {
        return destination;
    }

    public double getFare() {
        return fare;
    }
}
