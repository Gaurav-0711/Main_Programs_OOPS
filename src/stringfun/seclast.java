package stringfun;

import java.util.*;

public class seclast {
  public void penilti() {
        Scanner in = new Scanner(System.in);

        System.out.println("Input a sentence: ");
        String sentence = in.nextLine();
        String words[] = sentence.split(" ");

        int l = words.length;
        System.out.println("Penultimate word is: " + words[l - 2]);

        in.close();

    }
}