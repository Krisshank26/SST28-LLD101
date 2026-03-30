public class PenFactory {
    
    public static Pen getPen(String penType, String capType, String color, int inkCapacity ) 
    { 
        WriteStrategy writeStrategy ; 
        OpenStrategy openStrategy ; 
        CloseStrategy closeStrategy ; 
        Pen pen ; 
        if(capType.equals("Cap" ) ) 
        { 
            openStrategy= new OpenTypeCap() ; 
            closeStrategy= new CloseTypeCap() ; 
        } 
        else 
        { 
            openStrategy= new OpenTypeClick() ; 
            closeStrategy= new CloseTypeClick() ; 
        } 
        if(penType.equals("Gel" ) ) 
        { 
            writeStrategy= new WriteTypeGel() ; 
            pen= new PenTypeGel(penType, capType, color, inkCapacity, writeStrategy, openStrategy, closeStrategy ) ; 
        } 
        else 
        { 
            writeStrategy= new WriteTypeBall() ; 
            pen= new PenTypeBall(penType, capType, color, inkCapacity, writeStrategy, openStrategy, closeStrategy ) ; 
        } 
        writeStrategy.setPen(pen ) ; 
        openStrategy.setPen(pen ) ; 
        closeStrategy.setPen(pen ) ; 
        return pen ; 
    } 
} 
