public abstract class Pen {
    
    protected String penType ; 
    protected String capType ; 
    protected String color ; 
    protected int inkCapacity ; 
    protected int inkAmount ; 
    protected boolean status ; 
    protected WriteStrategy writeStrategy ; 
    protected OpenStrategy openStrategy ; 
    protected CloseStrategy closeStrategy ; 

    public Pen(String penType, String capType, String color, int capacity, WriteStrategy writeStrategy, OpenStrategy openStrategy, CloseStrategy closeStrategy ) 
    { 
        this.penType= penType ; 
        this.capType= capType ; 
        this.color= color ; 
        inkCapacity= capacity ; 
        inkAmount= inkCapacity ; 
        status= false ; 
        this.writeStrategy= writeStrategy ; 
        this.openStrategy= openStrategy ; 
        this.closeStrategy= closeStrategy ; 
    } 

    public abstract String write(String line ) ; 
    public void refill(String cl ) 
    { 
        this.color= cl ; 
        inkAmount= inkCapacity ; 
        System.out.println(penType+ " Pen has been refilled with "+ color+ " Color Having Capacity "+ inkCapacity ) ; 
    } 
    public abstract void open() ; 
    public abstract void close() ; 

    public String getPenType() 
    { 
        return penType ; 
    } 

    public String getCapType() 
    { 
        return capType ; 
    } 

    public String getColor() 
    { 
        return color ; 
    } 

    public void setColor(String cl ) 
    { 
        color= cl ; 
    } 

    public int getInkAmount() 
    { 
        return inkAmount ; 
    } 

    public void decrementInk(int amount ) 
    { 
        inkAmount= (inkAmount- amount ) ; 
    } 

    public int getInkCapacity() 
    { 
        return inkCapacity ; 
    } 

    public boolean getStatus() 
    { 
        return status ; 
    } 

    public void setStatus(boolean st ) 
    { 
        status= st ; 
    } 
} 
