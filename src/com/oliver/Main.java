package com.oliver;

public class Main {

    public static void main(String[] args) {

        PrintNumber pNum = new PrintNumber();

        PrintThread pOddNum = new PrintThread(pNum, true, "print odd thread");
        PrintThread pEvenNum = new PrintThread(pNum, false, "print even thread");

        try {
            pEvenNum.t.join();
            pOddNum.t.join();
        } catch(InterruptedException e) {
            System.out.println("main thread interrupted");
        }
    }
}
