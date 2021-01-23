package docComments;
/**
* This Class Constructs, edits, adds, and removes device objects from and ArrayList for use in the practice database.
*
*/
public class Device
{
    //Shared members
    private static int id = 1234567;
    
    //Only used inside the constructor of new devices. Device instances use the ID field
    private static int createID()
    {
        return id++;
    }

    //Instance members

    //I was thinking that we could just do Xbox or PlayStation
    private final int ID;
    private final String brand, model, storageSpace;

    /**
    * Constructor for a device object
    */
    public Device(String brand, String model, String storageSpace)
    {
        ID = createID();
        this.brand = brand;
        this.model = model;
        this.storageSpace = storageSpace;
    }

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
