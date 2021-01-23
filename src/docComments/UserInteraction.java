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

    public static String getStringResponse(String...prompt)
    {
        present(prompt);
        return scanner.nextLine();
    }

    public static int getIntResponse(int min, int max, String...prompt)
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

        return getNumberFromUser(1, userOptions.length);
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
        System.out.println(prompt);

        return scanner.nextLine();
    }

    public static void displayListSize(List<GameConsole> list)
    {
        System.out.println(list.size());
    }
}
