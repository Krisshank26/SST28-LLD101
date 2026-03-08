public class WhatsAppSender extends NotificationSender implements NotifySend {

    WhatsappHelp whatsappHelp= new WhatsappHelp() ;

    public WhatsAppSender(AuditLog audit)
    {
        super(audit ) ;
    }

    @Override
    public void send(Notification n) {
        // LSP violation: tightens precondition
        whatsappHelp.validate(n.phone ) ;
        /* if (n.phone == null || !n.phone.startsWith("+")) {
            throw new IllegalArgumentException("phone must start with + and country code");
        } */
        whatsappHelp.print(n ) ;
        /* System.out.println("WA -> to=" + n.phone + " body=" + n.body ) ; */
        audit.add("wa sent" ) ;
    }
}
