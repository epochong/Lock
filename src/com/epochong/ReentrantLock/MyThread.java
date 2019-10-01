package com.epochong.ReentrantLock;

/**
 * @author epochong
 * @date 2019/10/1 22:39
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class MyThread extends Thread {

    private MyService service;

    public MyThread(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
