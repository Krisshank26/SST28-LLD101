public class Cell 
{ 
    int cellNumber ; 
    int row ; 
    int col ; 

    public Cell(int pos, int r, int c ) 
    { 
        cellNumber= pos ; 
        row= r ; 
        col= c ; 
    } 

    public int getCellNumber() 
    { 
        return cellNumber ; 
    } 

    public int getRow() 
    { 
        return row ; 
    } 

    public int getCol() 
    { 
        return col ; 
    } 
} 