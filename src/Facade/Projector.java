package Facade;

/**
 * Projector to watch movies
 */
public class Projector {
    DvdPlayer dvdPlayer;

    void setInput(DvdPlayer dvdPlayer){
        this.dvdPlayer = dvdPlayer;
        System.out.println("Projector input set to DVD Player.");
    }

    void on(){
        System.out.println("Projector ON.");
    }

    void off(){
        System.out.println("Projector OFF.");
    }

    void tvMode(){
        System.out.println("Projector in TV mode.");
    }

    void wideScreenMode(){
        System.out.println("Projector in Wide Screen mode.");
    }
}
