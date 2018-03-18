package ro.siit.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValidatedTickets {
    private Set<Ticket> tickets = new HashSet<>();

    public synchronized void validateTicket(Ticket ticket){
        this.tickets.add(ticket);
        System.out.println(ticket.getValidated());
    }

    Map<TicketType, Integer> getResults(){
        Map<TicketType, Integer> results  = new HashMap<>();
        for(TicketType TicketType: TicketType.values()){
            results.put(TicketType, 0);
        }
        for(Ticket ticket : tickets){
            results.put(ticket.getValidated(), results.get(ticket.getValidated())+ 1);
        }
        return results;
    }
}
