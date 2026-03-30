public class GameRulesHard implements GameRules { 

    int count ; 

    public GameRulesHard() 
    { 
        count= 0 ; 
    } 

    public int makeMove(Game game ) 
    { 
        Player p= game.getPlayers().peek() ; 
        int pos= p.getCell().getCellNumber() ; 
        int steps= game.getDice().generateNumber() ; 
        Board b= game.getBoard() ; 
        if((pos+ steps )> b.getCells().size() ) 
        { 
            count= 0 ; 
            return steps ; 
        } 
        Cell cl= b.getCells().get(((pos+ steps )- 1 ) ) ; 
        p.setCell(cl ) ; 
        if(steps== 6 ) 
        { 
            if(count== 2 ) 
            { 
                count= 0 ; 
                return count ; 
            } 
            count++ ; 
        } 
        else 
        { 
            count= 0 ; 
        } 
        return steps ; 
    } 

    public void checkPosition(Game game ) 
    { 
        CheckPosition.checkCellHurdle(game ) ; 
    } 
} 
