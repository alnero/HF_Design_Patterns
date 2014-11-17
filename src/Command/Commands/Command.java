package Command.Commands;

/**
 * Command interface for command objects
 */
public interface Command {
    void execute();
    void undo();
}
