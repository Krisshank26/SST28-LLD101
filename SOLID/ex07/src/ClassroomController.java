public class ClassroomController {
    private final DeviceRegistry reg;

    public ClassroomController(DeviceRegistry reg) { this.reg = reg; }

    public void startClass() {
        /* SmartClassroomDevice pj = reg.getFirstOfType("Projector" ) ;
        pj.powerOn() ;
        pj.connectInput("HDMI-1" ) ; */

        Projector pj= reg.getProjector() ;
        pj.powerOn() ;
        pj.connectInput("HDMI-1" ) ;

        /* SmartClassroomDevice lights = reg.getFirstOfType("LightsPanel" ) ;
        lights.setBrightness(60 ) ; */

        LightsPanel lightsPanel= reg.getLightsPanel() ;
        lightsPanel.setBrightness(60 ) ;

        /* SmartClassroomDevice ac = reg.getFirstOfType("AirConditioner" ) ;
        ac.setTemperatureC(24 ) ; */

        AirConditioner airConditioner= reg.getAirConditioner() ;
        airConditioner.setTemperatureC(24 ) ;

        /* SmartClassroomDevice scan = reg.getFirstOfType("AttendanceScanner" ) ;
        System.out.println("Attendance scanned: present=" + scan.scanAttendance() ) ; */

        AttendanceScanner attendanceScanner= reg.getAttendanceScanner() ;
        System.out.println("Attendance scanner: present="+ attendanceScanner.scanAttendance() ) ;
    }

    public void endClass() {
        System.out.println("Shutdown sequence:");
        /* reg.getFirstOfType("Projector").powerOff() ; */
        reg.getProjector().powerOff() ;

        /* reg.getFirstOfType("LightsPanel").powerOff() ; */
        reg.getLightsPanel().powerOff() ;

        /* reg.getFirstOfType("AirConditioner").powerOff() ; */
        reg.getAirConditioner().powerOff() ;
    }
}
