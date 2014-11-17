package Command.Receivers;

/**
 * Super class for receivers
 */
public abstract class Receiver {
    String description;

    protected Receiver(String description) {
        this.description = description;
    }
}
