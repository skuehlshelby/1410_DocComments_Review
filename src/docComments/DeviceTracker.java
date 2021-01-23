package docComments;

import java.util.Arrays;
import java.util.List;

/**
 * A class that manages the database of console objects through the DeviceTracker Object.
 */
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

    /**
     * Creates a new DeviceTracker Object.
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
     * Adds a new Game Console to the database.
     * @param newGameConsole New Game Console Object
     */
    public void addGameConsole(GameConsole newGameConsole)
    {
        gameConsoles.add(newGameConsole);
    }

    /**
     * Removes a given Game Console from the database.
     * @param idNumber the id number for the given console in the database.
     * @throws Exception Throws exception if user enters invalid id#.
     */
    public void removeGameConsole(int idNumber) throws Exception
    {
        for (int i = 0; i < instance.gameConsoles.size(); i++)
        {
            if(gameConsoles.get(i).getID() == idNumber)
            {
                gameConsoles.remove(i);
                System.out.println("Console " + idNumber + " has been removed.");
            }
        }
        throw new Exception(String.format("Could not find a device with the id number %d", idNumber));
    }

    /**
     *  Returns the information about a given console including the Brand, Model, and Storage Information.
     * @param idNumber the id number for the console in the database.
     * @return Returns the information about a given console.
     * @throws Exception Throws exception if user enters invalid id#.
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
     * @param gameConsoles This is the list that stores all of the game consoles.
     */
    public void allDevices(List<GameConsole> gameConsoles)
    {

        for (int i = 0; i < instance.gameConsoles.size(); i++)
        {
            System.out.println(instance.gameConsoles.get(i));
        }
    }

    /**
     * Prints out the number of devices that are stored in the database.
     * @return Returns an integer that represents the number of devices in the database.
     */
    public int numberOfDevices()
    {
        return instance.gameConsoles.size();
    }
}
