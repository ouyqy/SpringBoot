package com.avalon.test.thread;

/**
 * Created by ouyqy on 2017/11/6.
 * <p>
 * 现有T1、T2、T3
 */
public class ThreadTestJoin {


    public static void main(String[] args) {

        Thread t1 = new Thread(new T1(),"线程1");
        Thread t2 = new Thread(new T2(),"线程2");
        Thread t3 = new Thread(new T3(),"线程3");


        try {
//            t1.start();
//            t2.start();
//            t3.start();
            t1.start();
            t1.join();

            t2.start();
            t2.join();

            t3.start();
            t3.join();


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class T1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);

            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}

class T2 implements Runnable {
    @Override
    public void run() {
        for (int i = 10; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class T3 implements Runnable {

    @Override
    public void run() {
        for (int i = 20; i < 30; i++) {
            System.out.println(Thread.currentThread().getName()+": "+ i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}