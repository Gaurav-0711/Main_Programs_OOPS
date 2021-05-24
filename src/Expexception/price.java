package Expexception;

public class price {
    public static void main(String[] args)
    {
        int price = 501;
        try
        {
            if(price>500)
                throw new Exp();
            else
            {
                System.out.println("Price is "+price);
             }
        }
        catch (Exp e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Thank you !");
        }
    }
}
