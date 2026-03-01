import java.util.List ;
import java.util.Map ; 

public class BillFormat { 
    
    public String formatBillSummary(String invId, double subtotal, double taxPct, double tax, double discount, double total, List<OrderLine > lines, Map<String, MenuItem > menu ) 
    { 
        StringBuilder str= new StringBuilder() ; 
        str.append("Invoice# ").append(invId).append("\n") ;
        for (OrderLine l : lines) {
            MenuItem item = menu.get(l.itemId);
            double lineTotal = item.price * l.qty;
            subtotal += lineTotal ; 
            str.append(String.format("- %s x%d = %.2f\n", item.name, l.qty, lineTotal));
        } 
        str.append(String.format("Subtotal: %.2f\n", subtotal ) ) ; 
        str.append(String.format("Tax(%.0f%%): %.2f\n", taxPct, tax ) ) ; 
        str.append(String.format("Discount: -%.2f\n", discount ) ) ; 
        str.append(String.format("TOTAL: %.2f\n", total ) ) ; 
        String out= str.toString() ; 
        System.out.print(out ) ; 
        return out ; 
    }
}
