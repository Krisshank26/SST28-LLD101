import java.util.ArrayList ; 
import java.util.List ;
import java.util.Random ; 

public class SnakeUtil { 
    
    public static List<Cell > getCell(List<Cell > cells ) 
    { 
        int sz= cells.size() ; 
        int mid= ((sz- 1 )/ 2 ) ; 
        Random rand= new Random() ; 
        List<Cell > list= new ArrayList<Cell >() ; 
        synchronized(SnakeUtil.class ) 
        { 
            int endPos= rand.nextInt(0, (mid+ 1 ) ) ; 
            int startPos= rand.nextInt((mid+ 1 ), sz ) ; 
            list.add(cells.get(startPos ) ) ; 
            list.add(cells.get(endPos ) ) ; 
            cells.remove(startPos ) ; 
            cells.remove(endPos ) ; 
        } 
        return list ; 
    } 
}
