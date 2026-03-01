public class SaveInvoice {
    
    private final FileInstance fi= new FileInstance() ; 

    public void saveInvoice(String invId, String printable ) 
    { 
        fi.getFileStore().save(invId, printable ) ; 
    } 
} 
