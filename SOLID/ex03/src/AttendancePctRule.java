public class AttendancePctRule implements AttendancePctInterface {

    public static String validate(int attendancePct )
    {
        if(attendancePct< 75 ) {
            return "attendance below 75";
        }
        return "" ;
    }
}
