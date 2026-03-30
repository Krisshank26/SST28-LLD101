import java.util.Map ; 

public class CheckPosition {
    
    public static void checkCellHurdle(Game game ) 
    { 
        Player p= game.getPlayers().peek() ; 
        Map<Cell, Hurdle > map= game.getBoard().getHurdles() ; 
        if(map.containsKey(p.getCell() ) ) 
        { 
            Hurdle hurdle= map.get(p.getCell() ) ; 
            System.out.println(p.getName()+ " has landed on a "+ hurdle.getType()+ " on "+ p.getCell().getCellNumber() ) ; 
            hurdle.movePlayer(p ) ; 
        } 
    } 
} 
