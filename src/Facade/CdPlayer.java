package Facade;

/**
 * CD Player
 */
public class CdPlayer {
    Amplifier amplifier;

    void setOutput(Amplifier amplifier){
        this.amplifier = amplifier;
    }


    void on(){
        System.out.println("CD Player ON.");
    }

    void off(){
        System.out.println("CD Player OFF.");
    }

    void play(){
        System.out.println("CD Player PLAY.");
    }

    void pause(){
        System.out.println("CD Player PAUSE.");
    }

    void stop(){
        System.out.println("CD Player STOP.");
    }

    void eject(){
        System.out.println("Eject the CD.");
    }
}
