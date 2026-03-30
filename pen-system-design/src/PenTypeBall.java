public class PenTypeBall extends Pen { 
    
    public PenTypeBall(String penType, String capType, String color, int capacity, WriteStrategy ws, OpenStrategy os, CloseStrategy cs ) 
    { 
        super(penType, capType, color, capacity, ws, os, cs ) ; 
    } 

    public String write(String line ) 
    { 
        return writeStrategy.write(line ) ; 
    } 

    public void open() 
    { 
        status= true ; 
        openStrategy.open() ; 
    } 

    public void close() 
    { 
        status= false ; 
        closeStrategy.close() ; 
    } 
} 
