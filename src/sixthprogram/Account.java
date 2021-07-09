package sixthprogram;

public class Account{
    float balance;
    Account()
    {
        balance=500;
    }
    void deposit(float amount, String currencytype)
    {
        String curr=currencytype.toUpperCase();
        try
        {
            if(curr.equals("OLD") && amount>5000)
                throw new DemonetizationException(amount);
            balance=balance+amount;
        }
        catch(DemonetizationException e)
        {
            System.out.println(""+ e);
        }
    }
    void withdraw(float amount)
    {
        if(amount<balance && balance>500)
        {   balance=balance-amount;
            System.out.println("Amount Withdrawn=Rs."+amount);
        }
        else if(balance-amount<500)
            System.out.println("No min balance");
    }
    void currBalance()
    {
        System.out.println("Balance in A/c= Rs."+balance);
    }
}

