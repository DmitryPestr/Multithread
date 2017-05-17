package com.company;

import java.util.Random;

public class Main {

    //Semaphore (5) - stavit organichenie skolko potokov mozet vipolnajt zadanie

    private static final NumberCollector collector = new NumberCollector();

    public static void main(String[] args) {
        System.out.println("PROGRAM START");

        for (int i = 0; i < 50; i++) {
            Thread thread = new Thread(Main::doInThread);
            thread.start();
        }

        System.out.println("PROGRAM FINISH");
    }

    public static void doInThread() {
        Random random = new Random();
        for (int i = 0; i < 90000; i++) {
            int num = random.nextInt();
            collector.add(num);
        }
    }
}
