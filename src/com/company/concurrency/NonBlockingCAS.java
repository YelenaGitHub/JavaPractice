package com.company.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class NonBlockingCAS {

    private AtomicInteger value = new AtomicInteger(0);
    private static int INCREASE_VOLME = 1;

    public void increase(){
        int old;
        int updatedValue;

        do {
            old = value.get();
            updatedValue = old + INCREASE_VOLME;

        } while (value.compareAndSet(old, updatedValue));
    }


    public int getValue(){
        return value.get();
    }

}
