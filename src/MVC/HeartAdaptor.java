package MVC;

/**
 * Adapting heart model to beat model.
 */
public class HeartAdaptor implements BeatModelInterface{
    HeartModelInterface heart;

    public HeartAdaptor(HeartModelInterface heart) {
        this.heart = heart;
    }

    @Override
    public void initialize() { /*NOP*/ }

    @Override
    public void on() { /*NOP*/ }

    @Override
    public void off() { /*NOP*/ }

    @Override
    public void setBpm(int bpm) { /*NOP*/ }

    @Override
    public int getBpm() {
        return heart.getHeartRate();
    }

    @Override
    public void registerObserver(BPMObserver observer) {
        heart.registerObserver(observer);
    }

    @Override
    public void removeObserver(BPMObserver observer) {
        heart.removeObserver(observer);
    }

    @Override
    public void registerObserver(BeatObserver observer) {
        heart.registerObserver(observer);
    }

    @Override
    public void removeObserver(BeatObserver observer) {
        heart.removeObserver(observer);
    }
}
