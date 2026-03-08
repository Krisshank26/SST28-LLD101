public class WhatsappHelp implements SmsWhatsappPrint, WhatsappValidate {

    public void print(Notification n )
    {
        System.out.println("WA -> to="+ n.phone+ " body="+ n.body ) ;
    }

    public void validate(String phoneNumber ) throws IllegalArgumentException
    {
        if(phoneNumber== null || !phoneNumber.startsWith("+" ) ) {
            throw (new IllegalArgumentException("phone must start with + and country code"));
        }
    }
}
