import java.util.Scanner ; 
import java.util.Queue ; 

public class Game {
    
    private Board b ; 
    private Queue<Player > players ; 
    private GameRules gameRules ; 
    private Dice dice ; 
    private int finishPosition ; 

    public Game(Queue<Player > pl, Board board, GameRules gre ) 
    { 
        players= pl ; 
        b= board ; 
        gameRules= gre ; 
        dice= new Dice() ; 
        finishPosition= 1 ; 
    } 

    public Queue<Player > getPlayers() 
    { 
        return players ; 
    } 

    public Board getBoard() 
    { 
        return b ; 
    } 

    public GameRules getGameRules() 
    { 
        return gameRules ; 
    } 

    public Dice getDice() 
    { 
        return dice ; 
    } 

    public int getFinishPosition() 
    { 
        return finishPosition ; 
    } 

    public void setFinishPosition() 
    { 
        finishPosition++ ; 
    } 

    public void start() 
    { 
        Scanner obn= new Scanner(System.in ) ; 
        while(!players.isEmpty() ) 
        { 
            Player p= players.peek() ; 
            System.out.println("Turn for "+ p.getName()+ " \n" ) ; 
            String action= obn.nextLine() ; 
            if(action.equals("exit" ) ) 
            { 
                return ; 
            } 
            System.out.println("Current Position of "+ p.getName()+ " Is: "+ p.getCell().getCellNumber() ) ; 
            int steps= gameRules.makeMove(this ) ; 
            if(p.getCell().getCellNumber()== b.getCells().size() ) 
            { 
                PlayerUtil.playerComplete(this ) ; 
            } 
            else 
            { 
                gameRules.checkPosition(this ) ; 
                System.out.println("Jump Position of "+ p.getName()+ " Is: "+ p.getCell().getCellNumber()+ "\n" ) ; 
                if(steps!= 6 ) 
                { 
                    p= players.poll() ; 
                    players.add(p ) ; 
                } 
            } 
        } 
    } 
} 
