package dwuke.command;

import dwuke.task.Event;
import dwuke.task.TaskList;

/**
 * This class encapsulates an event command from the user.
 */
public class EventCommand extends AddCommand {
    public static final String COMMAND_WORD = "event";
    public static final String COMMAND_SEPARATOR = "/at";

    /**
     * Creates an EventCommand with the given TaskList and Event.
     *
     * @param taskList The TaskList.
     * @param event    The Event.
     */
    public EventCommand(TaskList taskList, Event event) {
        super(taskList, event);
    }
}
