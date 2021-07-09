package stringfun;
import java.util.*;
public class substring {
   public void spli() {
        System.out.println("Enter the sentence: ");
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();

        System.out.println("Enter the character/s : ");

        String ch = in.next();

        String[] subs = sentence.split(ch);
        System.out.println("The resulting substrings are: ");
        for (String a : subs)
            System.out.print(a + " ");
    }
}