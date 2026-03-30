import java.util.LinkedList ;
import java.util.Queue ; 
import java.util.Scanner ; 

public class PlayerUtil { 
    
    public static Queue<Player > generatePlayers(int n, Cell cl ) 
    { 
        Scanner obn= new Scanner(System.in ) ; 
        Queue<Player > que= new LinkedList<Player >() ; 
        for(int i= 0 ; i< n ; ++i ) 
        { 
            System.out.println("Enter name of Player "+ (i+ 1 )+ ": " ) ; 
            String name= obn.nextLine() ; 
            Player p= new Player(name, cl ) ; 
            que.add(p ) ; 
        } 
        return que ; 
    } 

    public static void playerComplete(Game game ) 
    { 
        int position= game.getFinishPosition() ; 
        game.setFinishPosition() ; 
        Player p= game.getPlayers().poll() ; 
        System.out.print("Congratulations "+ p.getName()+ " you have completed the game " ) ; 
        if(position== 1 ) 
        { 
            System.out.println("1st \n " ) ; 
        } 
        else if(position== 2 ) 
        { 
            System.out.println("2nd \n " ) ; 
        } 
        else if(position== 3 ) 
        { 
            System.out.println("3rd \n " ) ; 
        } 
        else 
        { 
            System.out.println(position+ "th \n " ) ; 
        } 
    } 
} 
