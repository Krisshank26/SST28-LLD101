public class SmsHelp implements SmsWhatsappPrint {

    public void print(Notification n )
    {
        System.out.println("SMS -> to="+ n.phone+ " body="+ n.body ) ;
    }
}
