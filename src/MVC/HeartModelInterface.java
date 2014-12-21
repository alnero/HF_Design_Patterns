package MVC;

/**
 * Interface which happens to have some methods of the Beat model.
 */
public interface HeartModelInterface {
    int getHeartRate();
    void registerObserver(BeatObserver observer);
    void registerObserver(BPMObserver observer);
    void removeObserver(BeatObserver observer);
    void removeObserver(BPMObserver observer);
}
