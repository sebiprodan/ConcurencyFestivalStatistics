package ro.siit.homework;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class Randomizer {

    private static int randomNumberOfFestivalAtendee;

    public static int getWaitingTime() {
        return (new Random()).nextInt(10) + 5;
    }

    public static int getTicketTypeIndex(int size) {
        return (new Random()).nextInt(size);
    }

    public static int getTicketsCount() {
        randomNumberOfFestivalAtendee = ThreadLocalRandom.current().nextInt(100, 150 + 1);
        return randomNumberOfFestivalAtendee;
    }
}

