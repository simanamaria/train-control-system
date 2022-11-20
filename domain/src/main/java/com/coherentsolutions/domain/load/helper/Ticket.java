package com.coherentsolutions.domain.load.helper;

import com.coherentsolutions.domain.load.Passenger;

import java.util.*;

public class Ticket {
    private int ticketNumber;
    private int seatNumber;

    public Ticket(int ticketNumber, int seatNumber) {
        this.ticketNumber = ticketNumber;
        this.seatNumber = seatNumber;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

}



