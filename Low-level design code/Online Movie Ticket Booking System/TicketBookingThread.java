public class TicketBookingThread extends Thread {
    private Show show;
    private RegisteredUser user;
    private int numberOfSeats;
    private Ticket ticket;

    public TicketBookingThread(Show show, RegisteredUser user, int numberOfSeats) {
        this.show = show;
        this.user = user;
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void run() {
        this.ticket = show.bookTicket(user,numberOfSeats);
    }

    public Ticket getTicket() {
        return ticket;
    }
}
