import java.util.Map ; 
import java.util.Scanner ;
import java.util.ArrayList;
import java.util.HashMap ; 
import java.util.List;
import java.util.Queue;

public class Main {
    
    public static void main(String[] args ) 
    { 
        Scanner obj= new Scanner(System.in ) ; 
        System.out.println("Enter Difficulty: easy or hard " ) ; 
        String difficulty ; 
        difficulty= obj.nextLine() ; 
        int numberPlayers, boardSize, numberSnake, numberLadder ; 
        System.out.println("Enter Board Size: " ) ; 
        boardSize= obj.nextInt() ; 
        System.out.println("Enter Number of Players: " ) ; 
        numberPlayers= obj.nextInt() ; 

        List<Cell > cells= CellUtil.generateCells(boardSize ) ; 
        int sz= cells.size() ; 
        Queue<Player > players= PlayerUtil.generatePlayers(numberPlayers, cells.get(0 ) ) ; 

        System.out.println("Enter number of Snakes and Ladders: " ) ; 
        numberSnake= obj.nextInt() ; 
        numberLadder= obj.nextInt() ; 

        Map<String, Integer > map= new HashMap<String, Integer >() ; 
        map.put("snake", numberSnake ) ; 
        map.put("ladder", numberLadder ) ; 

        System.out.println("Please type exit when you want to end the game \n" ) ; 

        List<Cell > list= new ArrayList<Cell >() ; 
        for(int i= 1 ; i< (sz- 1 ) ; ++i ) 
        { 
            list.add(cells.get(i ) ) ; 
        } 

        Map<Cell, Hurdle > hurdles= HurdleUtil.generateHurdles(map, list ) ; 
        Board b= new Board.BoardBuilder().setCells(cells ).setHurdles(hurdles ).build() ; 

        Game game= GameFactory.generateGame(difficulty, b, players ) ; 
        game.start() ; 
        System.out.println("Game has been Completed " ) ; 
    } 
} 
