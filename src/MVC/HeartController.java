package MVC;

/**
 * Controller to use with Heart model, all operations are not supported by heart model, view is used just for monitoring.
 */
public class HeartController implements ControllerInterface {
    DJView view;
    HeartModelInterface model;

    public HeartController(HeartModelInterface model) {
        this.model = model;
        view = new DJView(new HeartAdaptor(model), this);
        view.createView(); // creating only the view, we not going to control the heart rhythm
    }

    @Override
    public void start() { /*NOP*/ }

    @Override
    public void stop() { /*NOP*/ }

    @Override
    public void setBPM(int bpm) { /*NOP*/ }

    @Override
    public void increaseBPM() { /*NOP*/ }

    @Override
    public void decreaseBPM() { /*NOP*/ }
}
