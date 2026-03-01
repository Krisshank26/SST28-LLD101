public class CalculateTotalAmount {
    
    public double calculateTotal(double subtotal, double tax, double discount ) 
    { 
        double total= ((subtotal+ tax )- discount ) ; 
        return total ; 
    } 
}
