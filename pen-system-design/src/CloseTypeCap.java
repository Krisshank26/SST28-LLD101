public class CloseTypeCap extends CloseStrategy { 

    public void close() 
    { 
        p.setStatus(false ) ; 
        System.out.println(p.getCapType()+ " Pen Is Close \n" ) ; 
    } 
} 
