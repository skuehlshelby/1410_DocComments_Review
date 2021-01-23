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
                    DeviceTracker.getInstance().addDevice(UserInteraction.getConsoleInfoFromUser());
                    break;
                case 3:
                    try
                    {
                        UserInteraction.printObject(DeviceTracker.getInstance().findDevice(UserInteraction.getNumberFromUser(1234567, Integer.MAX_VALUE)));
                    } catch (Exception e)
                    {
                        UserInteraction.printObject(e.getMessage());
                    }
                    break;
                case 4:
                    try
                    {
                        DeviceTracker.getInstance().removeDevice(UserInteraction.getNumberFromUser(1234567, Integer.MAX_VALUE));
                    } catch (Exception e)
                    {
                        UserInteraction.printObject(e.getMessage());
                    }
                    break;
                case 5:
                    UserInteraction.displayListSize(DeviceTracker.getInstance().allDevices());
                    break;
                case 6:
                    exit = true;
                    break;
            }
        }while(!exit);
    }
}
