import java.util.*;

public class CafeteriaSystem {
    private final Map<String, MenuItem> menu = new LinkedHashMap<>();
    /* private final FileStore store = new FileStore() ; */ 
    private int invoiceSeq = 1000; 

    private final InvoiceService is= new InvoiceService() ; 

    private final CalculateSubTotal cs= new CalculateSubTotal() ; 
    
    private final BillService bs= new BillService() ; 

    private final CalculateTax ct= new CalculateTax() ; 

    private final CalculateTotalAmount ca= new CalculateTotalAmount() ; 

    private final BillFormat bm= new BillFormat() ; 

    private final SaveInvoice sn= new SaveInvoice() ; 

    private final InvoicePrint ip= new InvoicePrint() ; 

    public void addToMenu(MenuItem i) { menu.put(i.id, i); } 

    public void addToMenu(List<MenuItem >list ) 
    { 
        int sz= list.size() ; 
        for(int i= 0 ; i< sz ; ++i ) 
        { 
            menu.put(list.get(i ).id, list.get(i ) ) ; 
        } 
    } 

    // Intentionally SRP-violating: menu mgmt + tax + discount + format + persistence.
    public void checkout(String customerType, List<OrderLine> lines) {
        /* String invId = "INV-" + (++invoiceSeq) ; 
        StringBuilder out = new StringBuilder() ; 
        out.append("Invoice# ").append(invId).append("\n") ; */ 
        String invId= is.generateInvoiceId() ; 

        /* double subtotal = 0.0 ; 
        for (OrderLine l : lines) {
            MenuItem item = menu.get(l.itemId);
            double lineTotal = item.price * l.qty;
            subtotal += lineTotal ; 
            out.append(String.format("- %s x%d = %.2f\n", item.name, l.qty, lineTotal));
        } */ 

        double subtotal= cs.calculateSubtotal(lines, menu ) ; 

        CalculateBill bill= bs.generateBill(customerType, subtotal, (lines.size() ) ) ; 
        /* double taxPct = TaxRules.taxPercent(customerType) ; 
        double tax = subtotal * (taxPct / 100.0) ; */ 

        double taxPct= bill.taxPercent() ; 
        double tax= ct.calculateTaxAmount(taxPct, subtotal ) ; 

        /* double discount = DiscountRules.discountAmount(customerType, subtotal, lines.size() ) ; 

        double total = subtotal + tax - discount ; */ 

        double discount= bill.getDiscount() ; 

        double total= ca.calculateTotal(subtotal, tax, discount ) ; 

        String out= bm.formatBillSummary(invId, subtotal, taxPct, tax, discount, total, lines, menu ) ; 

        /* out.append(String.format("Subtotal: %.2f\n", subtotal ) ) ; 
        out.append(String.format("Tax(%.0f%%): %.2f\n", taxPct, tax ) ) ; 
        out.append(String.format("Discount: -%.2f\n", discount ) ) ; 
        out.append(String.format("TOTAL: %.2f\n", total ) ) ; 

        String printable = InvoiceFormatter.identityFormat(out.toString() ) ; 
        System.out.print(printable ) ; */ 

        /* store.save(invId, printable) ; */ 

        sn.saveInvoice(invId, out ) ; 
        
        /* System.out.println("Saved invoice: " + invId + " (lines=" + store.countLines(invId) + ")" ) ; */ 

        ip.printInvoiceBill(invId ) ; 
    } 
} 