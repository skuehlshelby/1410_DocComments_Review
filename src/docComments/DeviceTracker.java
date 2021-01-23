package docComments;

import java.util.Arrays;
import java.util.List;

public class DeviceTracker
{
    //Shared members
    private static final DeviceTracker instance = new DeviceTracker();

    public static DeviceTracker getInstance()
    {
        return instance;
    }

    //Instance members
    private final List<GameConsole> gameConsoles;

    private DeviceTracker()
    {
        gameConsoles = Arrays.asList(
                new GameConsole("Xbox", "SeriesX", "1TB SSD"),
                new GameConsole("Xbox", "Xbox1", "500GB HDD"),
                new GameConsole("Playstation", "PS4", "1TB SSD"),
                new GameConsole("Playstation", "PS5", "500GB HDD"));
    }

    public void addDevice(GameConsole newGameConsole)
    {
        gameConsoles.add(newGameConsole);
    }

    public void removeDevice(int idNumber)
    {

    }

    public GameConsole findDevice(int idNumber)
    {
        for (GameConsole console : gameConsoles)
        {
            if(console.getID() == idNumber)
            {
                return console;
            }
        }
    }

    /**
     * Prints out all the devices stored in the devices ArrayList
     * @param gameConsoles
     */
    public void allDevices(List<GameConsole> gameConsoles)
    {
        int i;
        for (i = 0; i < instance.gameConsoles.size(); i++)
        {
            System.out.println(instance.gameConsoles.get(i));
        }
    }

    public int numberOfDevices()
    {
        return instance.gameConsoles.size();
    }
}
