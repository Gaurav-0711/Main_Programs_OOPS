package collectionsprogram;

import java.util.ArrayList;
import java.util.Collections;

 public class collect {

    public static void main(String[] args) {

        ArrayList<String> L= new ArrayList<String>();
        L.add("Red Bull");
        L.add("Mercedes");
        L.add("Mclaren");
        L.add("Ferrari");
        L.add("Alpine");


        String arr[]= new String[L.size()];
        arr=L.toArray(arr);
        System.out.println("\nElements of the Array made are:\n");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Index "+i+": "+arr[i]);
        }

        Collections.sort(L);
        System.out.println("\nSorted List is....."+ L+"\n");


        ArrayList<String> rev = new ArrayList<String>();
        for(int i =L.size()-1;i>=0;i--)
            rev.add(L.get(i));
        System.out.println("Reversed List: " + rev+"\n");

        System.out.println("Sublist is "+L.subList(1,4)+"\n");

        ArrayList<String> makeclone= (ArrayList<String>) L.clone();
        System.out.println("Cloned elements:"+ makeclone);

    }
}