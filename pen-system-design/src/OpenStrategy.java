public abstract class OpenStrategy {
    
    protected Pen p= null ; 

    public abstract void open() ; 

    public void setPen(Pen pen ) throws IllegalAccessError 
    { 
        try 
        { 
            if(p== null ) 
            { 
                p= pen ; 
            } 
            else 
            { 
                throw new IllegalAccessError("Pen has already been assign to OpenStrategy" ) ; 
            } 
        } catch (IllegalAccessError e ) 
        { 
            System.err.println(e ) ; 
        } 
    } 
} 
