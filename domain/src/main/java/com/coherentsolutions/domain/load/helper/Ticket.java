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

   /*   private Passenger passenger;
   private Date date;
   private static List<Ticket> ticketList = new ArrayList<>();

   public Ticket(Passenger passenger, Date date) {
      this.passenger = passenger;
      this.date = date;
   }

   public static List<Ticket> getTicketList() {
      return ticketList;
   }

   public static Ticket getInstance(Passenger passenger, Date date){
      Ticket temp = new Ticket(passenger, date);
      ticketList.add(temp);
      return temp;
   }*/
}



