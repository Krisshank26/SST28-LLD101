import java.util.ArrayList;
import java.util.List; 
import java.util.Random ; 

public class LadderUtil {
    
    public static List<Cell > getCell(List<Cell > cells ) 
    { 
        int sz= cells.size() ; 
        int mid= ((sz- 1 )/ 2 ) ; 
        Random rand= new Random() ; 
        List<Cell > list= new ArrayList<Cell >() ; 
        synchronized(LadderUtil.class ) 
        { 
            int startPos= rand.nextInt(0, (mid+ 1 ) ) ; 
            int endPos= rand.nextInt((mid+ 1 ), sz ) ; 
            list.add(cells.get(startPos ) ) ; 
            list.add(cells.get(endPos ) ) ; 
            cells.remove(endPos ) ; 
            cells.remove(startPos ) ; 
        } 
        return list ; 
    } 
} 
