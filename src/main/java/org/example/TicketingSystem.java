package org.example;

public class TicketingSystem {
    // Book a ticket for a user
    public void bookTicket(Ticket ticket, User user) {
        if (ticket.bookTicket()) {
            System.out.println("Ticket successfully booked for " + user.getName());
        } else {
            System.out.println("Sorry, the ticket for " + ticket.getEventName() + " is already booked.");
        }
    }

    // Print ticket details
    public void printTicketDetails(Ticket ticket) {
        ticket.printTicketDetails();
    }
}

