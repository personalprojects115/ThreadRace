package Threads;

public class Score {
    private long time;
    private int lap;

    public void addLapTime(long time){
        this.time += time;
    }

    public void addLap(int lap){
        this.lap = lap;
    }

    public int getLap() {
        return lap;
    }

    public long getTime(){
        return this.time;
    }
}
