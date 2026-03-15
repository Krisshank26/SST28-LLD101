import java.util.*;

public class DeviceRegistry {
    /* private final java.util.List<SmartClassroomDevice> devices = new ArrayList<>() ; */
    private final Projector projector ;
    private final LightsPanel lightsPanel ;
    private final AirConditioner airConditioner ;
    private final AttendanceScanner attendanceScanner ;

    public DeviceRegistry(Projector pro, LightsPanel lp, AirConditioner ar, AttendanceScanner asc )
    {
        projector= pro ;
        lightsPanel= lp ;
        airConditioner= ar ;
        attendanceScanner= asc ;
    }

    /* public void add(SmartClassroomDevice d) { devices.add(d) ; } */

    /* public SmartClassroomDevice getFirstOfType(String simpleName) {
        for (SmartClassroomDevice d : devices) {
            if (d.getClass().getSimpleName().equals(simpleName)) return d;
        }
        throw new IllegalStateException("Missing: " + simpleName);
    } */

    public Projector getProjector()
    {
        return projector ;
    }

    public LightsPanel getLightsPanel()
    {
        return lightsPanel ;
    }

    public AirConditioner getAirConditioner()
    {
        return airConditioner ;
    }

    public AttendanceScanner getAttendanceScanner()
    {
        return attendanceScanner ;
    }
}
