public class EmailHelp implements EmailPrint, EmailValidate {

    public void print(Notification n, String body )
    {
        System.out.println("EMAIL -> to=" + n.email + " subject=" + n.subject + " body=" + body ) ;
    }

    public String validate(String body )
    {
        if(body.length()> 40 ) {
            body = body.substring(0, 40);
        }
        return body ;
    }
}
