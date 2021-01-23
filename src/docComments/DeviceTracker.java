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

    public GameConsole findDevice(int idNumber) throws Exception
    {
        for (GameConsole console : gameConsoles)
        {
            if(console.getID() == idNumber)
            {
                return console;
            }
        }

        throw new Exception(String.format("Could not find a device with the id number %d", idNumber));
    }

    /**
     * Prints out all the devices stored in the devices ArrayList
     */
    public List<GameConsole> allDevices()
    {
        return instance.gameConsoles;
    }

    public int numberOfDevices()
    {
        return instance.gameConsoles.size();
    }
}
