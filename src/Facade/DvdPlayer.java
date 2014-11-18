package Facade;

/**
 * DVD player
 */
public class DvdPlayer {
    Amplifier amplifier;

    void setOutput(Amplifier amplifier){
        this.amplifier = amplifier;
    }

    void on(){
        System.out.println("DVD Player ON.");
    }

    void off(){
        System.out.println("DVD Player OFF.");
    }

    void play(String movie){
        System.out.println("DVD Player PLAYs movie - " + movie + ".");
    }

    void pause(){
        System.out.println("DVD Player PAUSE.");
    }

    void stop(){
        System.out.println("DVD Player STOP.");
    }

    void eject(){
        System.out.println("Eject the DVD.");
    }


    void setSurroundSound(){
        amplifier.setSurroundSound();
    }

    void setTwoChannelAudio(){
        amplifier.setStereoSound();
    }


}

