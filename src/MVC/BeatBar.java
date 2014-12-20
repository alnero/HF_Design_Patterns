package MVC;

import javax.swing.*;

/**
 * View component reflecting on the beats.
 */
public class BeatBar extends JProgressBar implements Runnable {
    Thread thread;

    public BeatBar() {
        thread = new Thread(this);
        setMaximum(100);
        thread.start();
    }

    // make the beat bar constantly drop its value to make the 'beat' effect
    @Override
    public void run() {
        while(true){
            int value = (int) (getValue() * 0.75);
            setValue(value);
            repaint();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
