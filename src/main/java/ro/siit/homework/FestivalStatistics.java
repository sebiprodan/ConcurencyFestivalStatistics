package ro.siit.homework;

public class FestivalStatistics extends Thread {


    private FestivalGate validatedTickets;

    public FestivalStatistics(FestivalGate validatedTickets){
        this.validatedTickets = validatedTickets;
    }
    @Override
    public void run() {

        while(true) {
            try {
                sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            App.printResults("Intermediate results", this.validatedTickets.getResults());
        }
    }
}
