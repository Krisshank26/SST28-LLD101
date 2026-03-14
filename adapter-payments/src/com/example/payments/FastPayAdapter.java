package com.example.payments ;

public class FastPayAdapter implements PaymentGateway
{
    private FastPayClient payFast ;

    public FastPayAdapter(FastPayClient client )
    {
        payFast= client ;
    }

    public String charge(String customerId, int amountCents )
    {
        String sca= payFast.payNow(customerId, amountCents ) ;
        return sca ;
    }
}