import java.util.List ;

public class ResultFormat {
    public static void formatReasoning(List<String > reasons )
    {
        int sz= reasons.size() ;
        for(int i= 0 ; i< sz ; ++i ) {
            if (reasons.get(i).isEmpty()) {
                reasons.remove(i) ;
                i-- ;
                sz-- ;
            }
        }
    }
}
