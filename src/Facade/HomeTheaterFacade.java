package Facade;

/**
 * Facade makes Home Theater interface simpler.
 */
public class HomeTheaterFacade {
    // use composition
    Amplifier amplifier;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;
    Tuner tuner;
    Projector projector;
    Screen screen;
    TheaterLights lights;
    PopcornPopper popper;

    public HomeTheaterFacade(
            Amplifier amplifier,
            DvdPlayer dvdPlayer,
            CdPlayer cdPlayer,
            Tuner tuner,
            Projector projector,
            Screen screen,
            TheaterLights lights,
            PopcornPopper popper) {
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.cdPlayer = cdPlayer;
        this.tuner = tuner;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
        this.popper = popper;
    }

    public void watchMovie(String movie){
        System.out.println("Be ready to watch movie...");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.setInput(dvdPlayer);
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setVolume(5);
        amplifier.setSurroundSound();
        amplifier.setDvd(dvdPlayer);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie(){
        System.out.println("Home Theater is shutting down...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }

    public void listenToCd(){
        cdPlayer.on();
        cdPlayer.setOutput(amplifier);
        amplifier.on();
        amplifier.setVolume(5);
        amplifier.setStereoSound();
        amplifier.setCd(cdPlayer);
    }

    public void endCD(){
        cdPlayer.stop();
        cdPlayer.eject();
        cdPlayer.off();
        amplifier.off();
    }

    public void listenToRadio(double frequency){
        tuner.on();
        tuner.setOutput(amplifier);
        tuner.setFM();
        tuner.setFrequency(frequency);
        amplifier.on();
        amplifier.setVolume(5);
        amplifier.setStereoSound();
        amplifier.setTuner(tuner);
    }

    public void endRadio(){
        tuner.off();
        amplifier.off();
    }
}
