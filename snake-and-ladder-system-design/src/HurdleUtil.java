import java.util.HashMap ; 
import java.util.List ; 
import java.util.Map;

public class HurdleUtil { 
    
    private static Hurdle getHurdle(String hurdleType, List<Cell > listCell ) 
    { 
        if(hurdleType== "Snake" ) 
        { 
            List<Cell > cl= SnakeUtil.getCell(listCell ) ; 
            Hurdle hurdle= new Snake("snake", cl.get(0 ), cl.get(1 ) ) ; 
            return hurdle ; 
        } 
        else 
        { 
            List<Cell > cl= LadderUtil.getCell(listCell ) ; 
            Hurdle hurdle= new Ladder("ladder", cl.get(0 ), cl.get(1 ) ) ; 
            return hurdle ; 
        } 
    } 

    public static Map<Cell, Hurdle > generateHurdles(Map<String, Integer > hurdleTypes, List<Cell > cells ) 
    { 
        Object arr[]= hurdleTypes.keySet().toArray() ; 
        Map<Cell, Hurdle > mp= new HashMap<Cell, Hurdle >() ; 
        for(int i= 0 ; i< arr.length ; ++i ) 
        { 
            String hurdleType= arr[i].toString() ; 
            int n= hurdleTypes.get(hurdleType ) ; 
            for(int j= 0 ; j< n ; ++j ) 
            { 
                Hurdle hurdle= getHurdle(hurdleType, cells ) ; 
                mp.put(hurdle.getStartCell(), hurdle ) ; 
            } 
        } 
        return mp ; 
    } 
} 
