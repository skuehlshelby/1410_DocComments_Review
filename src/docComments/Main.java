package docComments;

public class Main
{
    public static void main(String[] args)
    {
        boolean exit = false;

        do {
            try {
                switch (UserInteraction.getUserChoice())
                {
                    case SHOW_ALL_CONSOLES:
                        UserInteraction.present(DeviceTracker.getInstance()
                                .allGameConsoles()
                                .stream()
                                .map(GameConsole::toString)
                                .toArray(String[]::new));
                        break;

                    case ADD_A_CONSOLE:
                        GameConsole console = UserInteraction.getConsoleInfoFromUser();

                        DeviceTracker.getInstance()
                                .addGameConsole(console);

                        UserInteraction.present(String.format("Successfully added %s", console.toString()));
                        break;

                    case FIND_A_CONSOLE:
                            int consoleID = UserInteraction.getConsoleIDNumber();

                            UserInteraction.present(DeviceTracker.getInstance()
                                    .findGameConsole(consoleID)
                                    .toString());
                        break;

                    case DELETE_A_CONSOLE:
                            DeviceTracker.getInstance()
                                    .removeGameConsole(UserInteraction.getConsoleIDNumber());
                        break;

                    case DISPLAY_NUMBER_OF_CONSOLES:
                        UserInteraction.present(
                                String.format("There are %d consoles currently being tracked.",
                                        DeviceTracker.getInstance().allGameConsoles().size()));
                        break;

                    case EXIT:
                        UserInteraction.present("Goodbye...");
                        exit = true;
                        break;
                }
            }
            catch (Exception e)
            {
                UserInteraction.present(e.getMessage());
            }
        }while(!exit);
    }
}
