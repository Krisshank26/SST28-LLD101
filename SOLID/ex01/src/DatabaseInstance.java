public class DatabaseInstance {
    
    private static final FakeDb db= new FakeDb() ; 

    /* public void setDb(FakeDb database ) 
    { 
        db= database ; 
    } */ 

    public FakeDb getDb() 
    { 
        return db ; 
    } 
} 
