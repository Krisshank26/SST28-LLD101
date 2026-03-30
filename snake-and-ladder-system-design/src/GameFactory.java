import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner ; 

public class GameFactory {
    
    public static Game generateGame(String difficulty, Board b, Queue<Player > players ) 
    { 
        GameRules gameRules ; 
        if(difficulty.equals("easy" ) ) 
        { 
            gameRules= new GameRulesEasy() ; 
        } 
        else 
        { 
            gameRules= new GameRulesHard() ; 
        } 
        Game game= new Game(players, b, gameRules ) ; 
        return game ; 
    } 
} 
