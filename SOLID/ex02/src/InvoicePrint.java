public class InvoicePrint {
    
    private final FileInstance fi= new FileInstance() ; 

    public void printInvoiceBill(String invId ) 
    { 
        FileStore store= fi.getFileStore() ; 

        System.out.println("Saved invoice: " + invId + " (lines=" + store.countLines(invId) + ")" ) ; 
    } 
} 
