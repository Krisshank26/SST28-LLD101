import java.util.List ;

public class FlagRule implements FlagInterface {

    public static String validate(int disciplinaryFlag )
    {
        if(disciplinaryFlag!= LegacyFlags.NONE ) {
            return "cgr below 8.0" ;
        }
        return "" ;
    }
}
