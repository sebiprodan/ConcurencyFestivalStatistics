package ro.siit.homework;

public class FestivalStatistics extends Thread {


    private ValidatedTickets validatedTickets;
    private FestivalGate gate;

    public FestivalStatistics(FestivalGate gate){
        this.gate = gate;
    }

    public FestivalStatistics(ValidatedTickets validatedTickets){
        this.validatedTickets = validatedTickets;
    }
    @Override
    public void run() {
        while(true) {
            App.printResults("Intermediate results", this.validatedTickets.getResults());
            try {
                sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
