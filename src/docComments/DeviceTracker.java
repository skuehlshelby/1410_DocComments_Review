package docComments;

import java.util.Arrays;
import java.util.List;

/**
 * This class keeps track of all of the game console devices in an ArrayList.
 */
public class DeviceTracker
{
    //Shared members
    private static final DeviceTracker instance = new DeviceTracker();

    /**
     * Returns the Device Tracker Object instance.
     * @return Returns the Device Tracker Object instance.
     */
    public static DeviceTracker getInstance()
    {
        return instance;
    }

    //Instance members
    private final List<GameConsole> gameConsoles;

    /**
     * Constructor for the Device Tracker Object.
     */
    private DeviceTracker()
    {
        gameConsoles = Arrays.asList(
                new GameConsole("Xbox", "SeriesX", "1TB SSD"),
                new GameConsole("Xbox", "Xbox1", "500GB HDD"),
                new GameConsole("Playstation", "PS4", "1TB SSD"),
                new GameConsole("Playstation", "PS5", "500GB HDD"));
    }

    /**
     * Adds a new game console to the ArrayList
     * @param newGameConsole
     */
    public void addGameConsole(GameConsole newGameConsole)
    {
        gameConsoles.add(newGameConsole);
    }

    /**
     * Removes a given game console from the ArrayList
     * @param idNumber id number of given device
     * @throws Exception Throws exception if user enters an invalid id number.
     */
    public void removeGameConsole(int idNumber) throws Exception
    {
        Boolean removed = false;
        for (int i = 0; i < instance.gameConsoles.size(); i++)
        {
            if(instance.gameConsoles.get(i).getID() == idNumber)
            {
                gameConsoles.remove(i);
                removed = true;
                System.out.println("The device has been removed.");
            }
        }
        if (removed == false)
        {
            throw new Exception(String.format("Could not find a device with the id number %d", idNumber));
        }
    }

    /**
     * Searches for the game console with the given id Number.
     * @param idNumber id number of the game console
     * @return Returns the specific game console.
     * @throws Exception throws exception if user enters an invalid id number.
     */
    public GameConsole findGameConsole(int idNumber) throws Exception
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
     * Prints out all the devices stored in the devices ArrayList.
     */
    public List<GameConsole> allGameConsoles()
    {
        return instance.gameConsoles;
    }

    /**
     * Returns the number of game consoles in the ArrayList.
     * @return Returns the number of game consoles in the ArrayList as an integer.
     */
    public int numberOfGameConsoles()
    {
        return instance.gameConsoles.size();
    }
}
