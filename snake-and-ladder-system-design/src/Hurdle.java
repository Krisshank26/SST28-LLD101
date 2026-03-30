public abstract class Hurdle {
    
    protected String type ; 
    protected Cell startCell ; 
    protected Cell endCell ; 

    protected Hurdle(String ty, Cell start, Cell end ) 
    { 
        type= ty ; 
        startCell= start ; 
        endCell= end ; 
    } 

    public String getType() 
    { 
        return type ; 
    } 

    public Cell getStartCell() 
    { 
        return startCell ; 
    } 

    public Cell getEndCell() 
    { 
        return endCell ; 
    } 

    public abstract void movePlayer(Player p ) ; 
} 
