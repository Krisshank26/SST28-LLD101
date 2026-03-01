
public class Demo02 { 

    private static final CafeteriaSystem sys= new CafeteriaSystem() ; 

    private static final MenuService menu_service= new MenuService() ; 

    private static final OrderService order_service= new OrderService() ; 
    public static void main(String[] args) { 
        System.out.println("=== Cafeteria Billing ===") ; 

        /* CafeteriaSystem sys = new CafeteriaSystem() ; */ 

        menu_service.createMenuItems(sys ) ; 
        /* sys.addToMenu(new MenuItem("M1", "Veg Thali", 80.00)) ; 
        sys.addToMenu(new MenuItem("C1", "Coffee", 30.00)) ; 
        sys.addToMenu(new MenuItem("S1", "Sandwich", 60.00)) ; */ 

        /* List<OrderLine> order = List.of(
                new OrderLine("M1", 2),
                new OrderLine("C1", 1)
        ) ; */ 

        String customer_type= "student" ; 
        order_service.createOrderLines(sys, customer_type ) ; 

        /* sys.checkout("student", orders ) ; */ 
    } 
} 