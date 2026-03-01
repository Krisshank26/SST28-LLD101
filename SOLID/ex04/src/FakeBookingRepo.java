import java.util.Random;

public class FakeBookingRepo {

    private volatile static FakeBookingRepo instance= null ;

    private FakeBookingRepo() {}

    public static FakeBookingRepo getInstance()
    {
        if(instance== null ) {
            synchronized (FakeBookingRepo.class ) {
                if (instance == null) {
                    instance = new FakeBookingRepo() ;
                }
            }
        }
        return instance ;
    }

    public void save() {
        String bookingId = "H-" + (7000 + new Random(1).nextInt(1000) ) ;
        System.out.println("Saved booking: " + bookingId ) ;
    }
}
