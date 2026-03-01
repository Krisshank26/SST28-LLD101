import java.util.List ;

public class AddOnCategory {

    public static double addTotal(List<AddOn > addOns )
    {
        double amount= 0.00 ;
        int sz= addOns.size() ;
        for(int i= 0 ; i< sz ; ++i ) {
            if (addOns.get(i) == AddOn.MESS) {
                amount += AddOnMess.calculateAmount();
            } else if (addOns.get(i) == AddOn.LAUNDRY) {
                amount += AddOnLaundry.calculateAmount();
            } else if(addOns.get(i )== AddOn.GYM ) {
                amount += AddOnGym.calculateAmount();
            }
        }
        return amount ;
    }
}
