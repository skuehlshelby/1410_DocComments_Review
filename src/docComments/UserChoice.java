package docComments;

/**
 * The choices available to the user.
 */
public enum UserChoice
{
    SHOW_ALL_CONSOLES(1, "Show all consoles."),
    ADD_A_CONSOLE(2, "Add a console."),
    FIND_A_CONSOLE(3, "Find a console."),
    DELETE_A_CONSOLE(4, "Delete a console."),
    DISPLAY_NUMBER_OF_CONSOLES(5, "Display total number of consoles."),
    EXIT(6, "Exit.");

    private final int value;
    private final String displayFormat;

    UserChoice(int value, String displayFormat)
    {
        this.value = value;
        this.displayFormat = String.format("%d. %s", value, displayFormat);
    }

    /**
     * @return The numeric value of this choice.
     */
    public int getValue()
    {
        return value;
    }

    /**
     * @return A string representation of this choice.
     */
    @Override
    public String toString()
    {
        return displayFormat;
    }
}
