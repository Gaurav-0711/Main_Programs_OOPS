package stringfun;
import java.util.*;
public class change {
    public  void replace() {
        System.out.println("Enter the sentence: ");
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();
        String words[] = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].toLowerCase().equals("java"))
                words[i] = "Python";
            else if (words[i].toLowerCase().equals("python"))
                words[i] = "Java";
            System.out.print(words[i] + " ");
        }
    }
}