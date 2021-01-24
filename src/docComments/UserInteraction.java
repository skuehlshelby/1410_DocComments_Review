package docComments;

import java.util.Arrays;
import java.util.Scanner;

/**
 * A class which contains methods for interacting with the user.
 */
public class UserInteraction
{
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * @param prompt
     * The prompt to present to the user. Can consist of one or more strings.
     */
    public static void present(String...prompt)
    {
        for (String line : prompt)
        {
            System.out.println(line);
        }
    }

    private static String getStringResponse(String...prompt)
    {
        present(prompt);
        return scanner.nextLine();
    }

    private static int getIntResponse(int min, int max, String...prompt)
    {
        int selection;

        do {
            present(prompt);
            selection = scanner.nextInt();
        } while (selection < min || selection > max);

        scanner.nextLine();

        return selection;
    }

    /**
     * @return The action that the user would like to perform.
     */
    public static UserChoice getUserChoice()
    {
        present("", "Please select a choice from the menu:");

        int choice = getIntResponse(1, UserChoice.values().length, Arrays.stream(UserChoice.values()).map(UserChoice::toString).toArray(String[]::new));

        return Arrays.stream(UserChoice.values()).filter(selection -> selection.getValue() == choice).findFirst().get();
    }

    /**
     * @return The information necessary to create a new game console object.
     */
    public static GameConsole getConsoleInfoFromUser()
    {
        return new GameConsole(
                getStringResponse("What brand is the console?"),
                getStringResponse("What model is the console?"),
                getStringResponse("How much storage does the console have?"));
    }

    /**
     * @return An ID number which could belong to a game console.
     */
    public static int getConsoleIDNumber()
    {
        return getIntResponse(1234567, Integer.MAX_VALUE, "Please enter the console ID number.");
    }
}
