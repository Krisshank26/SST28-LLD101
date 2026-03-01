public class CalculateTax {
    
    public double calculateTaxAmount(double taxPct, double subtotal ) 
    { 
        double tax_amount= (subtotal* (taxPct/ 100.0 ) ) ; 
        return tax_amount ; 
    } 
} 
