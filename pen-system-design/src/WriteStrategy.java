public abstract class WriteStrategy { 
    
    protected Pen p= null ; 

    public abstract String write(String line ) ; 

    public void setPen(Pen pen ) throws IllegalAccessError 
    { 
        if(p== null ) 
        { 
            p= pen ; 
        } 
        else 
        { 
            throw new IllegalAccessError("Pen has already been assigned to WriteStrategy " ) ; 
        } 
    } 
} 
