package dwuke.command;

import dwuke.task.TaskList;
import dwuke.task.Deadline;

/**
 * This class encapsulates a deadline command from the user.
 */
public class DeadlineCommand extends AddCommand {
    public static final String COMMAND_WORD = "deadline";
    public static final String COMMAND_SEPARATOR = "/by";

    /**
     * Creates a DeadlineCommand with the given TaskList and Deadline.
     *
     * @param taskList The TaskList.
     * @param deadline The Deadline.
     */
    public DeadlineCommand(TaskList taskList, Deadline deadline) {
        super(taskList, deadline);
    }
}