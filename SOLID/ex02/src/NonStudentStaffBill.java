public class NonStudentStaffBill extends CalculateBill implements CustomerTypeable, NonStudentStaffDiscount {
    
    public NonStudentStaffBill() 
    { 
        discountAmount() ; 
    } 
    
    public double taxPercent() 
    { 
        return 8.00 ; 
    } 

    public void discountAmount() 
    { 
        discount= 0.00 ; 
    } 
} 
