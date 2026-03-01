public class ReportPrinter {

    private volatile static ReportPrinter instance= null ;

    private ReportPrinter() {}

    public static ReportPrinter getInstance()
    {
        if(instance== null ) {
            synchronized (ReportPrinter.class) {
                if (instance == null) {
                    instance = new ReportPrinter();
                }
            }
        }
        return instance ;
    }

    public void print(StudentProfile s, EligibilityEngineResult r) {
        /* System.out.println("Student: " + s.name + " (CGR=" + String.format("%.2f", s.cgr)
                + ", attendance=" + s.attendancePct + ", credits=" + s.earnedCredits
                + ", flag=" + LegacyFlags.nameOf(s.disciplinaryFlag) + ")");
        System.out.println("RESULT: " + r.status);
        for (String reason : r.reasons) System.out.println("- " + reason) ; */
        /* if (r.reasons.isEmpty() && "ELIGIBLE".equals(r.status)) {
            keep behavior stable even if empty
        }*/

        printStudentProfile(s ) ;
        printResultStatus(r ) ;

    }

    public void printStudentProfile(StudentProfile s )
    {
        System.out.println("Student: " + s.name + " (CGR=" + String.format("%.2f", s.cgr)
                + ", attendance=" + s.attendancePct + ", credits=" + s.earnedCredits
                + ", flag=" + LegacyFlags.nameOf(s.disciplinaryFlag) + ")") ;
    }

    public void printResultStatus(EligibilityEngineResult r )
    {
        System.out.println("RESULT: " + r.status);
        for (String reason : r.reasons) System.out.println("- " + reason);
        if (r.reasons.isEmpty() && "ELIGIBLE".equals(r.status)) {
            // keep behavior stable even if empty
            System.out.println("No reasons for not being eligible for Placement " ) ;
        }
    }
}
