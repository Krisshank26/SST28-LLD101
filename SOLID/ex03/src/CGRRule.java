public class CGRRule implements CGRInterface {

    public static String validate(double cgr )
    {
        if(cgr< 8.0 ) {
            return "crg below 8.0";
        }
        return "" ;
    }
}
