import java.util.ArrayList ;
import java.util.List ; 

public class OrderService { 
    
    public void createOrderLines(CafeteriaSystem sys, String customer_type ) 
    { 
        List<OrderLine > list= new ArrayList<OrderLine >() ; 
        OrderLine o1= new OrderLine("M1", 2) ; 
        OrderLine o2= new OrderLine("C1", 1) ; 
        list.add(o1 ) ; 
        list.add(o2 ) ; 
        sys.checkout(customer_type, list ) ; 
    } 
} 
