public class Ladder extends Hurdle {
    
    public Ladder(String type, Cell start, Cell end ) 
    { 
        super(type, start, end ) ; 
    } 

    public void movePlayer(Player p ) 
    { 
        p.setCell(endCell ) ; 
    } 
} 
