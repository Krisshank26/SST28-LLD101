public class Snake extends Hurdle {
    
    public Snake(String te, Cell start, Cell end ) 
    { 
        super(te, start, end ) ; 
    } 

    public void movePlayer(Player p ) 
    { 
        p.setCell(endCell ) ; 
    } 
} 
