package com.git.wacp.service;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class testA {
    public static void main(String[] arg) {
        AtomicInteger countA = new AtomicInteger(0);
        AtomicInteger countB = new AtomicInteger(0);

        if(countA == countB){
            System.out.print("This is True");
        }
        if(countA.equals(countB)){
            System.out.print("This is False");
        }
        final Lock lock = new ReentrantLock();
        final Condition full = lock.newCondition();

    }
}
