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
                    UserInteraction.displayListSize(DeviceTracker.getInstance().allDevices());
                case 2:
                    DeviceTracker.getInstance().addDevice(UserInteraction.getConsoleInfoFromUser());
            }
        }while(!exit);
    }
}
