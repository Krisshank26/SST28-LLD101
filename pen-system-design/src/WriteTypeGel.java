public class WriteTypeGel extends WriteStrategy { 

    public String write(String line ) 
    { 
        int len= WriteUtil.countCharacters(line ) ; 
        if(len<= p.getInkAmount() ) 
        { 
            return line ; 
        } 
        String st= WriteUtil.getPartialLine(line, p.getInkAmount() ) ; 
        return st ; 
    } 
} 
