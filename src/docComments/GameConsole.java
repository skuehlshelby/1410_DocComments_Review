package docComments;
/**
* This Class Constructs, edits, adds, and removes device objects from and ArrayList for use in the practice database.
*
*/
public class GameConsole
{
    //Shared members
    private static int id = 1234567;
    
    //Only used inside the constructor of new consoles. Device instances use the ID field.
    private static int createID()
    {
        return id++;
    }

    //Instance members
    private final int ID;
    private final String brand, model, storageSpace;

    /**
    * Constructor for a GameConsole object.
    */
    public GameConsole(String brand, String model, String storageSpace)
    {
        ID = createID();
        this.brand = brand;
        this.model = model;
        this.storageSpace = storageSpace;
    }

    /**
     * Returns a unique identifier for the console.
     */
    public int getID()
    {
        return ID;
    }

    /**
    * Returns the brand of the console.
    */
    public String getBrand()
    {
        return brand;
    }

    /**
    * Returns the model of the console.
    */
    public String getModel()
    {
        return model;
    }

    /**
    * Returns the HDD storage space on the console.
    */
    public String getStorageSpace()
    {
        return storageSpace;
    }

    /**
    * Gathers all information about the console and converts it into a string.
    */
    @Override
    public String toString()
    {
        return String.format("ID: %d, Brand: %s, Model: %s, Storage Space: %s", ID, getBrand(), getModel(), getStorageSpace());
    }
}
