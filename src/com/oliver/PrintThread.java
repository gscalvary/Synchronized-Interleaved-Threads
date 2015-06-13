package com.oliver;

public class PrintThread implements Runnable {

    Thread t;
    PrintNumber pN;
    String name;
    boolean isOdd;

    PrintThread(PrintNumber pN, boolean isOdd, String name) {

        this.name = name;
        this.pN = pN;
        this.isOdd = isOdd;
        t = new Thread(this, name);
        t.start();
    }

    public void run() {

        while(true) {
            int i = pN.print(name, isOdd);
            if(i >= 100) {
                break;
            }
        }
    }
}
