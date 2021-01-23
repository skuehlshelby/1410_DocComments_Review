package docComments;

import java.util.List;
import java.util.Scanner;

public class UserInteraction
{
    private static final Scanner scanner = new Scanner(System.in);

    private static final String[] userOptions =
            {
            "1. Show all consoles.",
            "2. Add a console.",
            "3. Find a console.",
            "4. Delete a console.",
            "5. Display total number of consoles.",
            "6. Exit"
            };

    public static void present(String...lines)
    {
        for (String line : lines)
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
        int selection = 0;

        do {
            present(prompt);
            selection = scanner.nextInt();
        } while (selection < min || selection > max);

        return selection;
    }

    public static int getUserSelection()
    {
        present(userOptions);

        return getIntResponse(1, userOptions.length, String.format("Please enter a number between %d and %d:", 1, userOptions.length));
    }

    public static GameConsole getConsoleInfoFromUser()
    {
        return new GameConsole(
                getStringResponse("What brand is the console?"),
                getStringResponse("What model is the console?"),
                getStringResponse("How much storage does the console have?"));
    }

    public static int getConsoleIDNumber()
    {
        return getIntResponse(1234567, Integer.MAX_VALUE, "Please enter the console ID number.");
    }

    public static void displayListSize(List<GameConsole> list)
    {
        present(String.format("There are %d consoles currently being tracked", list.size()));
    }
}
