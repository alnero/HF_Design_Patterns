package MVC;

import java.util.HashSet;
import java.util.Random;

/**
 * Implementation of Heart model.
 */
public class HeartModel implements HeartModelInterface, Runnable {
    HashSet<BPMObserver> bpmObservers = new HashSet<>();
    HashSet<BeatObserver> beatObservers = new HashSet<>();
    int time = 1000;
    Random random = new Random(System.currentTimeMillis());
    Thread thread;

    public HeartModel() {
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public int getHeartRate() {
        return 60_000 / time;
    }

    @Override
    public void registerObserver(BPMObserver observer) {
        this.bpmObservers.add(observer);
    }

    @Override
    public void removeObserver(BPMObserver observer) {
        this.bpmObservers.remove(observer);
    }

    public void notifyBPMObservers(){
        for(BPMObserver observer : this.bpmObservers){
            observer.updateBPM();
        }
    }

    @Override
    public void registerObserver(BeatObserver observer) {
        this.beatObservers.add(observer);
    }

    @Override
    public void removeObserver(BeatObserver observer) {
        this.beatObservers.remove(observer);
    }

    public void notifyBeatObservers(){
        for(BeatObserver observer : this.beatObservers){
            observer.updateBeat();
        }
    }


    // simulate heart rhythm
    @Override
    public void run() {
        int lastRate = -1;
        while(true){
            // add some variation in heart rate
            int change = random.nextInt(10);
            if(random.nextInt(2) == 0){
                change = 0 - change;
            }
            int rate = 60_000/(time + change);

            if(rate > 50 && rate < 120){
                time += change; // time is constantly deviating around 1000ms
                notifyBeatObservers(); // roughly every second notify beat observers
                if(rate != lastRate){
                    lastRate = rate;
                    notifyBPMObservers(); // notify BPM observers on every rate change
                }
            }
            System.out.println("change: " + change + " rate: " + rate + " time: " + time + " last rate: " + lastRate);

            // make this thread start a bit later than the thread with the controller,
            // this adds some latency as well
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
