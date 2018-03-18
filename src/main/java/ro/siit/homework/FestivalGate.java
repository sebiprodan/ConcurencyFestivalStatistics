package ro.siit.homework;

import java.util.*;


public class FestivalGate {
    private Queue<Ticket> validatedTickets = new LinkedList<>();

    public synchronized void validateTicket(Ticket ticket){
        this.validatedTickets.add(ticket);
        System.out.println(ticket.getValidatedTicketType());
    }

    Map<TicketType, Integer> getResults(){
        Map<TicketType, Integer> results  = new TreeMap<>();
        for(TicketType TicketType: TicketType.values()){
            results.put(TicketType, 0);
        }
        for(Ticket ticket : validatedTickets){
            results.put(ticket.getValidatedTicketType(), results.get(ticket.getValidatedTicketType())+ 1);
        }
        return results;
    }
}
