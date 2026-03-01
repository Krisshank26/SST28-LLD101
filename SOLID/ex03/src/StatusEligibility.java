import java.util.List ;

public class StatusEligibility {
    public static String checkStatus(List<String > reasons )
    {
        if(reasons.isEmpty() ) {
            return "ELIGIBLE";
        }
        else {
            return "NOT_ELIGIBLE";
        }
    }
}
