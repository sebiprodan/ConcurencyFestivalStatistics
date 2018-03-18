package ro.siit.homework;

public class FestivalAtendee extends Thread{

    private ValidatedTickets validatedTickets;
    private FestivalGate gate;
    private TicketType ticketType;
    private int i;

    public FestivalAtendee(TicketType ticketType, FestivalGate gate){
        this.ticketType = ticketType;
        this.gate = gate;
    }
    public FestivalAtendee(Integer i, ValidatedTickets validatedTickets, FestivalGate gate){
        this.i  = i;
        this.validatedTickets = validatedTickets;
        this.gate = gate;
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
