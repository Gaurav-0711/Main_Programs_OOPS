package Lambda;
import java.util.*;

public class Main{
    public static void main(String[] args) {
      operation prime = (int a)->{
           if (a==1)
                return false;
               for(int i=2; i<=a/2; i++)

                if(a%i==0)
                    return false;
            return true;
        };
        operation pali = (int a)->{
            int n = 0, t=a;
            while(t>0) {
                n *= 10;
                n += t%10;
                t /= 10;
            }
            return n == a;
        };
        operation isodd = (int a) ->{
         return a%2!=0;
        };

        Scanner in = new Scanner(System.in);

        System.out.println("1. Check odd");
        System.out.println("2. Check prime");
        System.out.println("3. Check palindrome");
        System.out.println("Enter choice and the number");

        int flag = 0;
        while(flag ==0) {
            int ch=0, n=0;
            ch = in.nextInt();

            switch(ch) {
                case 1: n = in.nextInt();
                    System.out.println("Odd " + isodd.ope(n));
                    break;
                case 2: n = in.nextInt();
                    System.out.println("Prime " + prime.ope(n));
                    break;
                case 3: n = in.nextInt();
                    System.out.println("Palindrome " + pali.ope(n));
                    break;
                default:System.out.println("\nExit\n");
                        flag =1;
                        break;
            }
        }
    }
}