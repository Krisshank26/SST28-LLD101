import java.util.ArrayList ; 
import java.util.List ; 
import java.util.Map ; 
import java.util.HashMap ; 

public class Board {
    
    private final BoardBuilder br ; 
    
    private Board(BoardBuilder b ) 
    { 
        br= b ; 
    } 

    public static class BoardBuilder 
    { 
        private List<Cell > cells ; 
        private Map<Cell, Hurdle > hurdles ; 

        public BoardBuilder() 
        { 
            cells= new ArrayList<Cell >() ; 
            hurdles= new HashMap<Cell, Hurdle >() ; 
        } 

        public BoardBuilder setCells(List<Cell > list ) 
        { 
            List<Cell > ls= new ArrayList<Cell >() ; 
            int sz= list.size() ; 
            for(int i= 0 ; i< sz ; ++i ) 
            { 
                ls.add(list.get(i ) ) ; 
            } 
            cells= ls ; 
            return this ; 
        } 

        public BoardBuilder setHurdles(Map<Cell, Hurdle > map ) 
        { 
            Map<Cell, Hurdle > mp= new HashMap<Cell, Hurdle >() ; 
            Object arr[]= map.keySet().toArray() ; 
            for(int i= 0 ; i< arr.length ; ++i ) 
            { 
                Cell hurdle= ((Cell )(arr[i] ) ) ; 
                mp.put(hurdle, map.get(hurdle ) ) ; 
            } 
            hurdles= mp ; 
            return this ; 
        } 

        public Board build() 
        { 
            Board b= new Board(this ) ; 
            return b ; 
        } 
    } 

    public List<Cell > getCells() 
    { 
        List<Cell > list= new ArrayList<Cell >() ; 
        int sz= br.cells.size() ; 
        for(int i= 0 ; i< sz ; ++i ) 
        { 
            list.add(br.cells.get(i ) ) ; 
        } 
        return list ; 
    } 

    public Map<Cell, Hurdle > getHurdles() 
    { 
        Map<Cell, Hurdle > mp= new HashMap<Cell, Hurdle >() ; 
        Object arr[]= br.hurdles.keySet().toArray() ; 
        for(int i= 0 ; i< arr.length ; ++i ) 
        { 
            Cell cl= ((Cell )(arr[i] ) ) ; 
            mp.put(cl, br.hurdles.get(cl ) ) ; 
        } 
        return mp ; 
    } 

    public Hurdle getHurdle(Cell cell ) 
    { 
        if(br.hurdles.containsKey(cell ) ) 
        { 
            return br.hurdles.get(cell ) ; 
        } 
        return null ; 
    } 
} 
