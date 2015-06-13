package com.oliver;

public class PrintNumber {

    private int i;

    PrintNumber() {

        i = 0;
    }

    synchronized int print(String name, boolean isOdd) {

        if(isOdd && i % 2 == 0) {
            parkThread(name);
        }

        if(!isOdd && i % 2 == 1) {
            parkThread(name);
        }

        System.out.println(name + ": " + i);
        i++;
        notifyAll();
        return i;
    }

    private void parkThread(String name) {

        try {
            wait();
        } catch(InterruptedException e) {
            System.out.println("wait for thread " + name + "interrupted");
        }
    }
}
