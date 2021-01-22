package docComments;
/**
* This Class Constructs, edits, adds, and removes device objects from and ArrayList for use in the practice database.
*
*/
public class Device
{
    //Shared members
    private static int id = 1111111;
    //I was thinking that we could just do Xbox or PlayStation
    String brand, model, storageSpace;
    
    //Cool idea to do the count and create the id at the same time. I think there would be an issue where if the user wanted to get the id that it would mess it up.
    //So we would need to have a different method for getting the id and another for creating it and assigning it. 
    private static int getID()
    {
        return id++;
    }

    //Instance members
    /**
    * Constructor for a device object
    */
    public Device(String brand, String model, String storageSpace)
    {
        ID = getID();
        this.brand = brand;
        this.model = model;
        this.storageSpace = storageSpace;
    }

    private final int ID;
    private final String thingOne;
    private final String thingTwo;
    private final String thingThree;

    /**
    * Returns the brand of the device
    */
    public String getBrand()
    {
        return brand;
    }
    /**
    * Returns the model of the device
    */
    public String getModel()
    {
        return model;
    }
    /**
    * Returns the HDD storage space on the device.
    */
    public String getStorageSpace()
    {
        return storageSpace;
    }
    /**
    * Gathers all information about the device and converts it into a string. 
    */
    @Override
    public String toString()
    {
        return String.format("ID: %d, Brand: %s, Model: %s, Storage Space: %s", ID, getBrand(), getModel(), getStorageSpace());
    }
}
