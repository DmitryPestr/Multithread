package com.company;

/**
 * Created by JavaCourses on 17.05.2017..
 */

public class MyThread extends Thread {
    private String id;

    public MyThread(String id) {
        this.id = id;
    }

    @Override
    public void run() {

        for (int i = 0; i < 1000; i++) {
            System.out.println("I'm the " + id + "! i = " + i);
        }

    }

}
