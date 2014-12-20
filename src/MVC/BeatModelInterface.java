package MVC;

/**
 * The main things beat model need to do. Do not forget that it is an observable as well.
 */
public interface BeatModelInterface {
    void initialize();
    void on();
    void off();
    void setBPM(int bpm);
    int getBPM();
    void registerObserver(BPMObserver observer);
    void removeObserver(BPMObserver observer);
    void registerObserver(BeatObserver observer);
    void removeObserver(BeatObserver observer);
}
