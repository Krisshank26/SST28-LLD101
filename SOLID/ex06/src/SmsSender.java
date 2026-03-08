public class SmsSender extends NotificationSender implements NotifySend {

    public SmsHelp smsHelp= new SmsHelp() ;

    public SmsSender(AuditLog audit)
    {
        super(audit ) ;
    }

    @Override
    public void send(Notification n ) {
        /* System.out.println("SMS -> to=" + n.phone + " body=" + n.body ) ; */
        smsHelp.print(n ) ;
        audit.add("sms sent" ) ;
    }
}
