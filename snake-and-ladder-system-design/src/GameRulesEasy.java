public class GameRulesEasy implements GameRules { 
    
    public int makeMove(Game game ) 
    { 
        int steps= game.getDice().generateNumber() ; 
        Player p= game.getPlayers().peek() ; 
        int pos= p.getCell().getCellNumber() ; 
        if((pos+ steps )> game.getBoard().getCells().size() ) 
        { 
            return steps ; 
        } 
        Cell cl= game.getBoard().getCells().get(((pos+ steps )- 1 ) ) ; 
        p.setCell(cl ) ; 
        return steps ; 
    } 

    public void checkPosition(Game game ) 
    { 
        CheckPosition.checkCellHurdle(game ) ; 
    } 
} 
