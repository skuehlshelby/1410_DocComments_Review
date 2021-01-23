package docComments;

import java.util.List;
import java.util.Scanner;

public class UserInteraction
{
    private static final Scanner scanner = new Scanner(System.in);

    private static final String[] userOptions =
            {
            "Show all consoles.",
            "Add a console.",
            "Find a console.",
            "Delete a console.",
            "Display total number of consoles.",
            "Exit"
            };

    private static void prompt()
    {
        for (int i = 0; i < userOptions.length; i++)
        {
            System.out.printf("%d. ", i + 1, userOptions[i]);
        }
    }

    public static int getUserSelection()
    {
        prompt();

        int selection = 0;

        do {
            System.out.print("Please enter your selection:");
            selection = scanner.nextInt();
        } while (selection < 1 || selection > userOptions.length);

        return selection;
    }

    public static GameConsole getConsoleInfoFromUser()
    {
        return new GameConsole(
                getUserResponse("What brand is the console?"),
                getUserResponse("What model is the console?"),
                getUserResponse("How much storage does the console have?"));
    }

    private static String getUserResponse(String prompt)
    {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static void displayListSize(List<GameConsole> list)
    {
        System.out.println(list.size());
    }
}
