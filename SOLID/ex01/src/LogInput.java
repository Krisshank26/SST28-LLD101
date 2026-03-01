public class LogInput { 

    private final DatabaseInstance db= new DatabaseInstance() ; 
    
    public void logUserData(StudentRecord rec ) 
    { 
        System.out.println("OK: created student " + rec.id ) ; 
        System.out.println("Saved. Total students: "+ db.getDb().count() ) ; 
        System.out.println("CONFIRMATION:") ; 
        System.out.println(rec ) ; 
    } 
} 
