package Application;

import Threads.Pilot;
import Threads.Score;

public class App {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao gran prix!");
        Score scoreP1 = new Score();
        Score scoreP2 = new Score();
        Thread p1 = new Thread(new Pilot("Ayrton Senna", scoreP1));
        Thread p2 = new Thread(new Pilot("Alain Prost", scoreP2));

        p1.start();
        p2.start();


        long timeP1 = scoreP1.getTime();
        long timeP2 = scoreP2.getTime();


        if (timeP1 == timeP2){
            System.out.println("Empate!");
        } else{
            if (timeP1 > timeP2){
                System.out.println("Vencedor: Ayrton Senna");
            }
        }
    }
}
