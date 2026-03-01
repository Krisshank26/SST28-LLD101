import java.util.ArrayList ;
import java.util.List ; 

public class MenuService { 

    public void createMenuItems(CafeteriaSystem sys ) 
    { 
        List<MenuItem > list= new ArrayList<MenuItem >() ; 
        MenuItem m1= new MenuItem("M1", "Veg Thali", 80.00 ) ; 
        MenuItem m2= new MenuItem("C1", "Coffee", 30.00) ; 
        MenuItem m3= new MenuItem("S1", "Sandwich", 60.00 ) ; 
        list.add(m1 ) ; 
        list.add(m2 ) ; 
        list.add(m3 ) ; 
        sys.addToMenu(list ) ; 
    } 
} 
