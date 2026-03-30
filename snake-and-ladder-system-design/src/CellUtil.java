import java.util.ArrayList ;
import java.util.List ; 

public class CellUtil { 

    public static List<Cell > generateCells(int size ) 
    { 
        int sta= 1 ; 
        List<Cell > list= new ArrayList<Cell >() ; 
        for(int i= 0 ; i< size ; ++i ) 
        { 
            for(int j= 0 ; j< size ; ++j ) 
            { 
                Cell cl= new Cell(sta, (i+ 1 ), (j+ 1 ) ) ; 
                list.add(cl ) ; 
                sta++ ; 
            } 
        } 
        return list ; 
    } 
} 
