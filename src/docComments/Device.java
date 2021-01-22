package docComments;
/**
* This Class Constructs, edits, adds, and removes device objects from and ArrayList for use in the practice database.
*
*/
public class Device
{
    //Shared members
    private static int id = 1111111;



    private static int getID()
    {
        return id++;
    }

    //Instance members
    public Device(String thingOne, String thingTwo, String thingThree)
    {
        ID = getID();
        this.thingOne = thingOne;
        this.thingTwo = thingTwo;
        this.thingThree = thingThree;
    }

    private final int ID;
    private final String thingOne;
    private final String thingTwo;
    private final String thingThree;


    public String getThingOne()
    {
        return thingOne;
    }

    public String getThingTwo()
    {
        return thingTwo;
    }

    public String getThingThree()
    {
        return thingThree;
    }

    @Override
    public String toString()
    {
        return String.format("ID: %d, Thing One: %s, Thing Two: %s, Thing Three: %s", ID, getThingOne(), getThingTwo(), getThingThree());
    }
}
