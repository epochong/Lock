package com.epochong.ReentrantLock;

/**
 * @author epochong
 * @date 2019/10/1 22:40
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();

        MyThread thread1 = new MyThread(service);
        MyThread thread2 = new MyThread(service);
        MyThread thread3 = new MyThread(service);
        MyThread thread4 = new MyThread(service);
        MyThread thread5 = new MyThread(service);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
