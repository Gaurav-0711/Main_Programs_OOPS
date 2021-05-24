package Expexception;

public class Exp extends Exception{
    @Override
    public String getMessage()
    {
       return "Price is too much";
    }
}
