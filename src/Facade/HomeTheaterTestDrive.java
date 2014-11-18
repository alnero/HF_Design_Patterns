package Facade;

/**
 * Help us facade!
 */
public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        DvdPlayer dvdPlayer = new DvdPlayer();
        CdPlayer cdPlayer = new CdPlayer();
        Tuner tuner = new Tuner();
        Projector projector = new Projector();
        Screen screen = new Screen();
        TheaterLights lights = new TheaterLights();
        PopcornPopper popper = new PopcornPopper();

        HomeTheaterFacade ht = new HomeTheaterFacade(amplifier, dvdPlayer, cdPlayer, tuner, projector, screen, lights, popper);
        ht.watchMovie("Riders on the storm");
        System.out.println("............................");
        ht.endMovie();
    }

}
