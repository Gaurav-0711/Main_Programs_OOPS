package ProgramSeven;

import java.util.Scanner;

public class ThreadSelf{
    public static void main(String[] args)
            throws InterruptedException {

        System.out.println("Enter the number of fruits capacity of the market");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String[] fruli = new String[]{"apple", "orange", "grape", "watermelon"};

        final Market ma = new Market(a);


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    ma.producer(fruli);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    ma.consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        t1.start();
        t2.start();


        t1.join();
        t2.join();
    }
}
