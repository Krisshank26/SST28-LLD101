public class RoomCategory {
    public static RoomTypes assignRoom(int roomType )
    {
        RoomTypes room ;
        if(roomType== LegacyRoomTypes.SINGLE ) {
            room = new SingleRoom();
        }
        else if(roomType== LegacyRoomTypes.DOUBLE ) {
            room = new DoubleRoom();
        }
        else if(roomType== LegacyRoomTypes.TRIPLE ) {
            room = new TripleRoom() ;
        }
        else {
            room = new DeluxeRoom() ;
        }
        return room ;
    }
}
