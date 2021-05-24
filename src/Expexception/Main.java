package Expexception;

public class Main
{
    // Driver Program
    public static void main(String args[])
    {
        try
        {
            throw new MyException("Error");
        }
        catch (MyException e1)
        {
            System.out.println("Exception Caught");
        }
    }
}
