public class CalculateMoney {

    public static Money calculateDeposit()
    {
        Money money= new Money(5000.00 ) ;
        return money ;
    }

    public static Money calculateMonthly(BookingRequest req )
    {
        RoomTypes room= RoomCategory.assignRoom(req.roomType ) ;
        double addOnAmount= AddOnCategory.addTotal(req.addOns ) ;
        double roomMoney= room.calculateAmount() ;
        Money money= new Money(roomMoney+ addOnAmount ) ;
        return money ;
    }
}
