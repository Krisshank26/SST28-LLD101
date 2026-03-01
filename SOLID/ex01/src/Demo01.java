public class Demo01 { 
    public static void main(String[] args) {
        
        try 
        { 
            System.out.println("=== Student Onboarding ===");
            /* FakeDb db = new FakeDb() ; */ 
            /* OnboardingService svc = new OnboardingService(db) ; */ 
            OnboardingService svc= new OnboardingService() ; 
            DatabaseInstance db= new DatabaseInstance() ; 

            String raw = "name=;email=riyasst.edu;phone=9876543210;program=" ; 
            svc.registerFromRawInput(raw) ; 

            System.out.println(); 
            System.out.println("-- DB DUMP --") ; 
            System.out.print(TextTable.render3(db.getDb() ) ) ; 
        } catch (Exception e ) 
        { 
            System.out.println(e.getMessage() ) ; 
        } 
    } 
} 