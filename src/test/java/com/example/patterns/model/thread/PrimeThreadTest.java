package com.example.patterns.model.thread;

import static org.junit.jupiter.api.Assertions.*;

class PrimeThreadTest {


    public static void main(String[] args) {
        PrimeThread primeThread = new PrimeThread(143);
        primeThread.start();

        PrimeRun primeRun = new PrimeRun(143);
        new Thread(primeRun).start();

    }
}