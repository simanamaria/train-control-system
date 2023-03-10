package com.coherentsolutions.domain.load.helper;

import com.coherentsolutions.domain.load.helper.Ticket;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TicketTest {

    @Test
    public void testConstructor() {
        Ticket actualTicket = new Ticket(10, 10);
        actualTicket.setSeatNumber(10);
        actualTicket.setTicketNumber(10);
        assertEquals(10, actualTicket.getSeatNumber());
        assertEquals(10, actualTicket.getTicketNumber());
    }
}

