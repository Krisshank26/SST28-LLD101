public class EarnedCreditsRule implements EarnedCreditsInterface {
    public static String validate(int earnedCredits )
    {
        if(earnedCredits< 20 ) {
            return "credits below 20";
        }
        return "" ;
    }
}
