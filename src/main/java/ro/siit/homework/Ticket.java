package ro.siit.homework;

public class Ticket {
    protected TicketType validated;

    public Ticket(TicketType validated) {
        this.validated = validated;
    }

    TicketType getValidated(){
        return validated;
    }
}

