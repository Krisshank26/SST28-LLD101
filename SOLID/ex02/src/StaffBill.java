public class StaffBill extends CalculateBill implements CustomerTypeable, StaffDiscount {
    
    private int linesize ; 
    public StaffBill(int ls ) 
    { 
        linesize= ls ; 
        discountAmount(linesize ) ; 
    } 

    public double taxPercent() 
    { 
        return 2.00 ; 
    } 

    public void discountAmount(int linesize ) 
    { 
        if(linesize>= 3 ) 
        { 
            discount= 15.00 ; 
        } 
        else 
        { 
            discount= 5.00 ; 
        } 
    } 
} 
