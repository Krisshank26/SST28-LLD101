// Smell: unused config-like class.
import java.util.List ;
import java.util.ArrayList ;

public class RuleInput {
    /* public int disciplinaryFlag= LegacyFlags.NONE ;
    public double minCgr = 8.0;
    public int minAttendance = 75;
    public int minCredits = 20 ; */
    private List<String > reasons ;

    public RuleInput()
    {
        reasons= new ArrayList<String >() ;
    }

    public List<String > validateStudent(StudentProfile s )
    {
        reasons.add(FlagRule.validate(s.disciplinaryFlag ) ) ;
        reasons.add(CGRRule.validate(s.cgr ) ) ;
        reasons.add(AttendancePctRule.validate(s.attendancePct ) ) ;
        reasons.add(EarnedCreditsRule.validate(s.earnedCredits ) ) ;
        ResultFormat.formatReasoning(reasons ) ;
        return reasons ;
    }
}
