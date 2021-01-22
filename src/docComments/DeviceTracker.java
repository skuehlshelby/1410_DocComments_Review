package docComments;

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

    public DeviceTracker instance()
    {
        return this;
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

    public List<Device> allDevices()
    {
        return instance.devices;
    }

    public int numberOfDevices()
    {
        return instance.devices.size();
    }
}
