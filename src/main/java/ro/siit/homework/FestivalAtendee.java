package ro.siit.homework;

public class FestivalAtendee extends Thread {

    protected FestivalGate validatedTickets;
    protected TicketType ticketType;
    private int i;


    public FestivalAtendee(Integer i, FestivalGate validatedTickets) {
        this.i = i;
        this.validatedTickets = validatedTickets;
    }

    @Override
    public void run() {
        try {

            sleep(Randomizer.getWaitingTime() * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        TicketType validated = TicketType.values()[Randomizer.getTicketTypeIndex(TicketType.values().length)];
        Ticket ticket = new Ticket(validated);
        this.validatedTickets.validateTicket(ticket);
    }
}
