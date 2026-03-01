
public class BillService { 

    public CalculateBill generateBill(String customer_type, double subtotal, int linesize ) 
    { 
        CalculateBill bill ; 
        if(customer_type== "student" ) 
        { 
            bill= new StudentBill(subtotal ) ; 
        } 
        else if(customer_type== "staff" ) 
        { 
            bill= new StaffBill(linesize ) ; 
        } 
        else 
        { 
            bill= new NonStudentStaffBill() ; 
        } 
        return bill ; 
    } 
} 
