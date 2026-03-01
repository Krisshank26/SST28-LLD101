public class InvoiceService {
    
    private static int invoiceSeq= 1000 ; 

    public String generateInvoiceId() 
    { 
        String invId = "INV-" + (++invoiceSeq) ; 
        return invId ; 
    } 
} 
