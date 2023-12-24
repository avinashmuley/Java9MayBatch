package Multithreading;

import java.awt.print.Book;

public class BookTicket {
    private static Integer ticketAvailable = 100;
    synchronized static void bookTicket(int requiredTicket){
        if (ticketAvailable >= requiredTicket){
            ticketAvailable = ticketAvailable - requiredTicket;
            System.out.println(requiredTicket + "are booked");
            System.out.println("Total Ticket are Available" + ticketAvailable);
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }

        } else {
            System.out.println("No ticket available !!");
        }
    }
}


class ThreadTicket1 extends Thread{
    private BookTicket bookTicket;
    private int tickets;
    ThreadTicket1( int tickets,BookTicket bookTicket){
        this.tickets =tickets;
        this.bookTicket= bookTicket;
    }

    @Override
    public void run() {
       bookTicket.bookTicket(tickets);
    }
}

class ThreadTicket2 extends Thread {
    private BookTicket bookTicket2;
    private int tickets;

    ThreadTicket2(int tickets, BookTicket bookTicket2) {
        this.tickets = tickets;
        this.bookTicket2 = bookTicket2;
    }

    @Override
    public void run() {
        bookTicket2.bookTicket(tickets);
    }
}



class BookTicketImpl{
    public static void main(String[] args) {
        BookTicket bookTicket = new BookTicket();
        ThreadTicket1 t1 = new ThreadTicket1(10,bookTicket);
        ThreadTicket2 t2 =new ThreadTicket2(20,bookTicket);

        BookTicket bookTicket2 = new BookTicket();
        ThreadTicket1 t3 =new ThreadTicket1(30,bookTicket);
        ThreadTicket2 t4 = new ThreadTicket2(40,bookTicket2);


        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

}