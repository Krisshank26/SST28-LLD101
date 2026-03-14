package com.example.payments ;

public class SafeCashAdapter implements PaymentGateway
{
    private SafeCashClient cashSafe ;

    public SafeCashAdapter(SafeCashClient client )
    {
        cashSafe= client ;
    }

    public String charge(String customerId, int amountCents )
    {
        SafeCashPayment payCash= cashSafe.createPayment(amountCents, customerId ) ;
        String csp= payCash.confirm() ; 
        return csp ; 
    } 
} 