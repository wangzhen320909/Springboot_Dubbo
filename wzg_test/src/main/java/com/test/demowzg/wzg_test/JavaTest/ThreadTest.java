package com.test.demowzg.wzg_test.JavaTest;

public class ThreadTest {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread t1 = new Thread(new MyThread(1));
        Thread t2 = new Thread(new MyThread(1));
        t1.start();
        t2.start();
    }
}


class MyThread implements Runnable{
    private int i =0;
    public MyThread(int num){
        i = num;
    }
    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println(Thread.currentThread().getName()+"-->我是通过实现接口的线程实现方式！");
        i++;
        System.out.println("计算假发："+ i);
    }
}
