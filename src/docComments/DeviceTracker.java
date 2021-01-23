package docComments;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class DeviceTracker
{
    private static final DeviceTracker instance = new DeviceTracker();

    private final List<Device> devices;

    private DeviceTracker()
    {
        devices = new ArrayList<Device>() {};
    }

    public static DeviceTracker getInstance()
    {
        return instance;
    }

    public void addDevice(Device newDevice)
    {
        throw new NotImplementedException();
    }

    public void removeDevice(int idNumber)
    {
        throw new NotImplementedException();
    }

    public Device findDevice(int idNumber)
    {
        throw new NotImplementedException();
    }

    public List<Device> allDevices()
    {
        return instance.devices;
    }

    public int numberOfDevices()
    {
        return instance.devices.size();
    }
}
