package docComments;

public class Main
{
    public static void main(String[] args)
    {
        boolean exit = false;

        do {
            switch (UserInteraction.getUserSelection())
            {
                case 1:
                    UserInteraction.present(DeviceTracker.getInstance().allGameConsoles().toArray(new String[DeviceTracker.getInstance().allGameConsoles().size()]));
                    break;
                case 2:
                    GameConsole console = UserInteraction.getConsoleInfoFromUser();
                    DeviceTracker.getInstance().addGameConsole(console);
                    UserInteraction.present(String.format("Successfully added %s", console.toString()));
                    break;
                case 3:
                    try
                    {
                        UserInteraction.present(DeviceTracker.getInstance().findGameConsole(UserInteraction.getConsoleIDNumber()).toString());
                    } catch (Exception e)
                    {
                        UserInteraction.present(e.getMessage());
                    }
                    break;
                case 4:
                    try
                    {
                        DeviceTracker.getInstance().removeGameConsole(UserInteraction.getConsoleIDNumber());
                    } catch (Exception e)
                    {
                        UserInteraction.present(e.getMessage());
                    }
                    break;
                case 5:
                    UserInteraction.displayListSize(DeviceTracker.getInstance().allGameConsoles());
                    break;
                case 6:
                    UserInteraction.present("Goodbye...");
                    exit = true;
                    break;
            }
        }while(!exit);
    }
}
