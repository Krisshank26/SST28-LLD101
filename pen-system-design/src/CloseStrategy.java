public abstract class CloseStrategy {
    
    protected Pen p= null ; 

    public abstract void close() ; 

    public void setPen(Pen pen ) throws IllegalAccessError 
    { 
        if(p== null ) 
        { 
            p= pen ; 
        } 
        else 
        { 
            throw new IllegalAccessError("Pen has already been assigned to CloseStrategy" ) ; 
        } 
    }
} 
