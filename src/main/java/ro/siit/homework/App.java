package ro.siit.homework;

import java.util.Map;

public class App {

    public static void main(String[] args) {
        int ticketsCount;
        FestivalGate validatedTickets;
        FestivalAtendee[] festivalAtendees;

        validatedTickets = new FestivalGate();
        ticketsCount = Randomizer.getTicketsCount();
        festivalAtendees = new FestivalAtendee[ticketsCount];

        for (int i = 0; i < ticketsCount; i++) {
            festivalAtendees[i] = new FestivalAtendee(i,validatedTickets);
            festivalAtendees[i].start();
        }

        FestivalStatistics festivalStatistics = new FestivalStatistics(validatedTickets);
        festivalStatistics.setDaemon(true);
        festivalStatistics.start();

        for (FestivalAtendee festivalAtendee : festivalAtendees) {
            try {
                festivalAtendee.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //display results
        App.printResults("Final results", validatedTickets.getResults());
    }


    public static void printResults(String message, Map<TicketType, Integer> results) {
        System.out.println("--------------------------------------");
        System.out.println(message);
        for (TicketType ticketType : results.keySet()) {
            System.out.println(results.get(ticketType) + " participants have " + ticketType + " tickets.");
        }
        System.out.println("--------------------------------------");
    }

}
