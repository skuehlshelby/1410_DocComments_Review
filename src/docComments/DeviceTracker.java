package docComments;

import java.util.ArrayList;
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
    private final List<Device> devices;

    private DeviceTracker()
    {
        devices = Arrays.asList(
                new Device("Xbox", "SeriesX", "1 TB SSD"),
                new Device("Xbox", "Xbox1", "500 GB HDD"),
                new Device("Playstation", "PS4", "500 GB HDD"),
                new Device("Playstation", "PS5", "1 TB SSD"));
    }

    public void addDevice(Device newDevice)
    {

    }

    public void removeDevice(int idNumber)
    {

    }

    public Device findDevice(int idNumber)
    {

    }

    /**
     * Prints out all the devices stored in the devices ArrayList
     * @param devices
     */
    public void allDevices(List<Device> devices)
    {
        int i;
        for (i = 0; i < instance.devices.size(); i++)
        {
            System.out.println(instance.devices.get(i));
        }
    }

    /**
     * Prints the number of devices that are stored in the Array List
     * @return Returns the size of the devices ArrayList
     */
    public int numberOfDevices()
    {
        return instance.devices.size();
    }
}
