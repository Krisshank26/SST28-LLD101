public class Player {
    
    private String name ; 
    private Cell cell ; 

    public Player(String nm, Cell cl ) 
    { 
        name= nm ; 
        cell= cl ; 
    } 

    public String getName() 
    { 
        return name ; 
    } 

    public Cell getCell() 
    { 
        return cell ; 
    } 

    public void setCell(Cell cl ) 
    { 
        cell= cl ; 
    } 
} 
