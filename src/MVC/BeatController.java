package MVC;

/**
 * Implementation of the controller for the beat machine.
 */
public class BeatController implements ControllerInterface{
    BeatModelInterface model;
    DJView view;

    public BeatController(BeatModelInterface model) {
        this.model = model;
        view = new DJView(model, this);
        view.createView();
        view.createControls();
        view.disableStopMenu();
        view.enableStartMenu();
        model.initialize();
    }

    @Override
    public void start() {
        view.disableStartMenu();
        view.enableStopMenu();
        model.on();
    }

    @Override
    public void stop() {
        view.disableStopMenu();
        view.enableStartMenu();
        model.off();
    }

    @Override
    public void setBPM(int bpm) {
        model.setBPM(bpm);
    }

    @Override
    public void increaseBPM() {
        model.setBPM(model.getBPM() + 1);
    }

    @Override
    public void decreaseBPM() {
        model.setBPM(model.getBPM() - 1);
    }
}
