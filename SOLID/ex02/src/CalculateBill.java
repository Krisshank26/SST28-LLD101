import java.util.List ; 
import java.util.Map ; 

public abstract class CalculateBill {
    
    protected double discount= 0.00 ; 

    public abstract double taxPercent() ; 

    public double getDiscount() 
    { 
        return discount ; 
    } 
} 
