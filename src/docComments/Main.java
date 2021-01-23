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

                    break;
                case 2:
                    DeviceTracker.getInstance().addGameConsole(UserInteraction.getConsoleInfoFromUser());
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
                    exit = true;
                    break;
            }
        }while(!exit);
    }
}
