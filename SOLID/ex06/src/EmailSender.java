public class EmailSender extends NotificationSender implements NotifySend {

    EmailHelp emailHelp= new EmailHelp() ;

    public EmailSender(AuditLog audit )
    {
        super(audit ) ;
    }

    @Override
    public void send(Notification n ) {
        String body = n.body ;
        /* if (body.length() > 40) body = body.substring(0, 40 ) ; */
        body= emailHelp.validate(body ) ;
        emailHelp.print(n, body ) ;
        /* System.out.println("EMAIL -> to=" + n.email + " subject=" + n.subject + " body=" + body ) ; */

        audit.add("email sent" ) ;
    }
}
