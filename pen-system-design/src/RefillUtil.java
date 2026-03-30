public class RefillUtil {
    
    public static boolean emptyRefill(Pen p ) 
    { 
        if(p.getInkAmount()== 0 ) 
        { 
            System.out.println("Please Refill the Pen before Continuing Write \n" ) ; 
            return true ; 
        } 
        return false ; 
    } 
} 
