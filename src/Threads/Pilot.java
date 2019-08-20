package Threads;

import java.util.Random;

public class Pilot implements Runnable {
    private String name;
    private Random random;
    private Score score;

    public Pilot(String name, Score score) {
        this.score = score;
        this.name = name;
        this.random = new Random();
    }

    @Override
    public void run() {
        long time = 0;

        for (int i = 0; i < 10; i++) {
            try {
                time = generateNumber();
                Thread.sleep(time);
                score.addLap(i);
                score.addLapTime(time);
                System.out.println("Piloto: " + name + "| voltas: " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private long generateNumber() {
        return random.nextInt(10);
    }

}
