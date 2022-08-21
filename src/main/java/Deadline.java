import java.time.LocalDate;
import java.time.DateTimeException;

/**
 * This class encapsulates a deadline set by the user.
 */
public class Deadline extends Task {
    private LocalDate date;

    Deadline(String str) throws DwukeException, DateTimeException {
        super(str);
        String[] arguments = getArguments(str);
        this.changeDescription(arguments[0]);
        this.date = Date.parse(arguments[1]);
    }

    private static String[] getArguments(String str) throws DwukeException, DateTimeException {
        int index = str.indexOf("/by");

        if (index == -1) throw new DwukeException("'/by' not fwound");

        try {
            String description = str.substring(0, index - 1);
            String date = str.substring(index + 4);
            return new String[]{description, date};
        } catch (StringIndexOutOfBoundsException e) {
            throw new DwukeException("da descwiption and date cannot be empty");
        }
    }

    /**
     * Returns the String representation of this deadline.
     *
     * @return A String representing this deadline.
     */
    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " + Date.format(this.date) + ")";
    }
}
