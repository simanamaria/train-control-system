package com.coherentsolutions.domain.load;

import com.coherentsolutions.domain.load.helper.Ticket;

import java.util.HashMap;
import java.util.Map;

public class Passenger extends User{

    private Ticket ticket;
    public Passenger(String firstName, String lastName, int age, Ticket ticket) {
        super(firstName, lastName, age);
        this.ticket = ticket;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
