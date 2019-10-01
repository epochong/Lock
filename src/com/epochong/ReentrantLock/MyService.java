package com.epochong.ReentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author epochong
 * @date 2019/10/1 22:37
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class MyService {

    private Lock lock = new ReentrantLock();

    public void testMethod() {
        lock.lock();
        for (int i = 0; i < 5; i++) {
            System.out.println("ThreadName=" + Thread.currentThread().getName() + " " + (i + 1));
        }
        lock.unlock();
    }
}
