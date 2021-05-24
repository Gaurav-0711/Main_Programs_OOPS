package sixthprogram;

import java.util.*;
@SuppressWarnings("serial")


public class sixthProg
{
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        Account acc= new Account();
        while(true)
        {
            System.out.println("1.Deposit\n2.Current bal\n3.Withdraw\n4.Exit\nEnter your choice:");
            int ch=inp.nextInt();
            switch(ch)
            {
                case 1: System.out.println("Enter the amount to be deposited");
                    float amount=inp.nextFloat();
                    System.out.println("Enter amount type");
                    String type=inp.next();
                    acc.deposit(amount,type);
                    break;
                case 2: acc.currBalance();
                    break;
                case 3: System.out.println("Enter amount to be withdrawn: ");
                    float amount1=inp.nextFloat();
                    acc.withdraw(amount1);
                    break;
                case 4: System.exit(0);
            }
        }
        // inp.close();
    }
}