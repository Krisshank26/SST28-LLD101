import java.util.Scanner ; 

public class Main { 
    
    public static void main(String[] args ) 
    { 
        Scanner obn= new Scanner(System.in ) ; 
        String penType, capType, color ; 
        int inkCapacity ; 
        System.out.println("Enter Pen Type: Gel or Ball " ) ; 
        penType= obn.nextLine() ; 
        System.out.println("\nEnter Cap Type: Cap Or Click " ) ; 
        capType= obn.nextLine() ; 
        System.out.println("\nEnter Color Of Ink: " ) ; 
        color= obn.nextLine() ; 
        System.out.println("\nEnter Capacity Of Ink: " ) ; 
        inkCapacity= obn.nextInt() ; 
        obn.nextLine() ; 
        System.out.println() ; 
        Pen pen= PenFactory.getPen(penType, capType, color, inkCapacity ) ; 
        while(true ) 
        { 
            System.out.println("Perform Action: write refill open close exit " ) ; 
            String action= obn.nextLine() ; 
            System.out.println() ; 
            if(action.equals("write" ) ) 
            { 
                if(pen.getStatus()== false ) 
                { 
                    System.out.println("Please Open the Pen first \n" ) ; 
                    continue ; 
                } 
                else 
                { 
                    if(RefillUtil.emptyRefill(pen ) ) 
                    { 
                        continue ; 
                    } 
                    System.out.println("Please Enter what you would like to write: " ) ; 
                    String st= obn.nextLine() ; 
                    System.out.println() ; 
                    String s= pen.write(st ) ; 
                    if(s.length()== st.length() ) 
                    { 
                        System.out.println("Your Input has been Written Successfully \n" ) ; 
                    } 
                    else 
                    { 
                        System.out.println("We could only write this part of your input: \n"+ s ) ; 
                        System.out.println("Please refill the pen to continue Writing more " ) ; 
                    } 
                    pen.decrementInk(WriteUtil.countCharacters(s ) ) ; 
                    System.out.println("Refill Amount Left Is: "+ pen.getInkAmount()+ "\n" ) ; 
                } 
            } 
            else if(action.equals("refill" ) ) 
            { 
                System.out.println("Enter the color you would like to refill your pen with: " ) ; 
                String cl= obn.nextLine() ; 
                System.out.println() ; 
                pen.refill(cl ) ; 
                System.out.println() ; 
            } 
            else if(action.equals("open" ) ) 
            { 
                pen.open() ; 
            } 
            else if(action.equals("close" ) ) 
            { 
                pen.close() ; 
            } 
            else if(action.equals("exit" ) ) 
            { 
                break ; 
            } 
            else 
            { 
                System.out.println("Please enter valid Action Here \n " ) ; 
            } 
        } 
        if(pen.getStatus()== true ) 
        { 
            pen.close() ; 
        } 
        System.out.println("Thank You for using our Pen System " ) ; 
    } 
} 
