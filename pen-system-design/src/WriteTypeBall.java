public class WriteTypeBall extends WriteStrategy { 

    public String write(String line ) 
    { 
        int len= WriteUtil.countCharacters(line ) ; 
        if(len<= p.getInkAmount() ) 
        { 
            return line ; 
        } 
        String s= WriteUtil.getPartialLine(line, p.getInkAmount() ) ; 
        return s ; 
    } 
} 
