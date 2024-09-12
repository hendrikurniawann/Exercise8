package org.example;

public class Ticket implements Ticketable {
    // Private attributes for encapsulation
    private int ticketID;
    private String eventName;
    private double price;
    private boolean isBooked;

    // Static field to keep track of total tickets sold
    private static int totalTicketsSold = 0;

    // Constructor
    public Ticket(int ticketID, String eventName, double price) {
        this.ticketID = ticketID;
        this.eventName = eventName;
        this.price = price;
        this.isBooked = false;
    }

    // Getters and Setters (Encapsulation)
    public int getTicketID() {
        return ticketID;
    }

    public String getEventName() {
        return eventName;
    }

    public double getPrice() {
        return price;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        this.isBooked = booked;
    }

    // Static method to get total tickets sold
    public static int getTotalTicketsSold() {
        return totalTicketsSold;
    }

    // Method to book a ticket
    public boolean bookTicket() {
        if (!isBooked) {
            setBooked(true);
            totalTicketsSold++;
            return true;
        } else {
            return false;
        }
    }

    // Print ticket details method from interface
    @Override
    public void printTicketDetails() {
        System.out.println("Ticket ID: " + ticketID);
        System.out.println("Event Name: " + eventName);
        System.out.println("Price: " + price);
        System.out.println("Is Booked: " + (isBooked ? "Yes" : "No"));
    }
}

