package RVCE;


import CSE.Thirdsem;

public class runner {
    public static void main(String[] args)
    {
        Thirdsem b = new Thirdsem();
        Csedept a = new Csedept();
        a.display();
        a.Welcomemsg();
        b.Welcomemsg();
        Thirdsem b1;
        b1 = a;
        ((Csedept)b1).Welcomemsg();

    }
}
