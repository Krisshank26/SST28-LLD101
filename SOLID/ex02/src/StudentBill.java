public class StudentBill extends CalculateBill implements CustomerTypeable, StudentDiscount { 

    private double subtotal ; 

    public StudentBill(double st ) 
    { 
        subtotal= st ; 
        discountAmount(subtotal ) ; 
    } 

    public double taxPercent() 
    { 
        return 5.0 ; 
    } 

    public void discountAmount(double subtotal ) 
    { 
        if(subtotal>= 180.00 ) 
        { 
            discount= 10.00 ; 
        } 
    } 
} 
