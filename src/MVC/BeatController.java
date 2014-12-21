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
        model.setBpm(bpm);
    }

    @Override
    public void increaseBPM() {
        model.setBpm(model.getBpm() + 1);
    }

    @Override
    public void decreaseBPM() {
        model.setBpm(model.getBpm() - 1);
    }
}
