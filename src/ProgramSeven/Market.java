package ProgramSeven;

import java.util.ArrayList;

class Market {


    ArrayList<String> Fruits = new ArrayList<>();
    int fruitsNumber;


    public Market(int fruitsNumber) {
        this.fruitsNumber = fruitsNumber;
    }

    synchronized boolean isFull() {
        return Fruits.size() == fruitsNumber;

    }

    synchronized boolean isEmpty() {
        return Fruits.size() == 0;

    }

    synchronized void producer(String[] fruli ) throws InterruptedException {
        int value = 0;
        while (true) {
            while (this.isFull()) {
                wait();
            }


            System.out.println("Farmer produced-"
                    + fruli[value]);

            Fruits.add(fruli[value]);
            value = value + 1;

            if (value == fruli.length) {
                value = 0;
            }


            notify();


            Thread.sleep(1000);

        }

    }

    synchronized String consumer() throws InterruptedException {
        int index = 0;

        while (true) {
            while (this.isEmpty()) {
                wait();
            }
            String fl = Fruits.get(index);
            Fruits.remove(index);
            System.out.println("Consumer consumed -" + fl);
            notify();
            Thread.sleep(1000);

        }

    }
}
