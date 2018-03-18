package ro.siit.homework;

import java.util.Random;

public class Randomizer {
    public static int getWaitingTime(){
        return (new Random()).nextInt(10) + 5;
    }

    public static int getTicketTypeIndex(int size){
        return (new Random()).nextInt(size);
    }

    public static int getTicketsCount(){
        return (new Random()).nextInt(200) + 1 ;
    }
}

