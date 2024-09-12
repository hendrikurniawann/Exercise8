package org.example;

public class Main {
    public static void main(String[] args) {
        // Create instances of tickets
        Ticket ticket1 = new Ticket(1, "Music Concert", 50.0);
        Ticket ticket2 = new Ticket(2, "Tech Conference", 100.0);

        // Create instances of users
        User user1 = new User("John Doe");
        User user2 = new User("Jane Smith");

        // Create an instance of TicketingSystem to manage tickets
        TicketingSystem ticketingSystem = new TicketingSystem();

        // Print details of the tickets before booking
        System.out.println("Before Booking:");
        ticketingSystem.printTicketDetails(ticket1);
        ticketingSystem.printTicketDetails(ticket2);

        // Attempt to book tickets
        System.out.println("\nBooking Tickets:");
        ticketingSystem.bookTicket(ticket1, user1);
        ticketingSystem.bookTicket(ticket2, user2);

        // Print details of the tickets after booking
        System.out.println("\nAfter Booking:");
        ticketingSystem.printTicketDetails(ticket1);
        ticketingSystem.printTicketDetails(ticket2);

        // Display total tickets sold
        System.out.println("\nTotal Tickets Sold: " + Ticket.getTotalTicketsSold());
    }
}
