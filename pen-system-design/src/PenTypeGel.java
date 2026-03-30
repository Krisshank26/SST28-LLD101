public class PenTypeGel extends Pen {
    
    public PenTypeGel(String penType, String capType, String color, int capacity, WriteStrategy ws, OpenStrategy os, CloseStrategy cs ) 
    { 
        super(penType, capType, color, capacity, ws, os, cs ) ; 
    } 

    public String write(String line ) 
    { 
        return writeStrategy.write(line ) ; 
    } 

    public void open() 
    { 
        openStrategy.open() ; 
    } 

    public void close() 
    { 
        closeStrategy.close() ; 
    } 
} 
