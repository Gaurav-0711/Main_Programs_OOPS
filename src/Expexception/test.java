package Expexception;


public class test
{
    public static void main(String[] args)
    {
        int a[] = new int[3];
        int n;
        try
        {
            n = a[4]/0;
            System.out.println(n);
        }
        catch (ArithmeticException e)
        {
            System.out.println("THe exception is "+e);
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("THe exception is "+ex);
        }
        catch(Exception ee)
        {
            System.out.println("THe exception is "+ee);
        }
    }

}
