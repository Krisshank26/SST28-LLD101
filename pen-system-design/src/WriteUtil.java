public class WriteUtil {
    
    public static int countCharacters(String line ) 
    { 
        int len= line.length() ; 
        int count= 0 ; 
        for(int i= 0 ; i< len ; ++i ) 
        { 
            char ch= line.charAt(i ) ; 
            if(ch!= ' ' ) 
            { 
                count++ ; 
            } 
        } 
        return count ; 
    } 

    public static String getPartialLine(String line, int inkAmount ) 
    { 
        StringBuilder str= new StringBuilder() ; 
        int len= line.length() ; 
        int amount= 0 ; 
        for(int i= 0 ; i< len ; ++i ) 
        { 
            char ch= line.charAt(i ) ; 
            if(ch!= ' ' ) 
            { 
                amount++ ; 
                if(amount== (inkAmount+ 1 ) ) 
                { 
                    break ; 
                } 
            } 
            str.append(ch ) ; 
        } 
        String s= str.toString() ; 
        return s ; 
    } 
} 
