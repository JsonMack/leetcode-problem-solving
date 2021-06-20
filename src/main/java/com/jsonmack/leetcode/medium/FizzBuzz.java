package com.jsonmack.leetcode.medium;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.IntConsumer;

/**
 * @author Jason MacKeigan
 */
public class FizzBuzz {

    private Lock lock = new ReentrantLock();

    private final Condition fizzCondition = lock.newCondition();

    private final Condition buzzCondition = lock.newCondition();

    private final Condition fizzBuzzCondition = lock.newCondition();

    private final Condition numberOnlyCondition = lock.newCondition();

    private int n;

    public FizzBuzz(int n) {
        this.n = n;
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        if (lock.tryLock()) {
            try {
                printFizz.run();
            } finally {
                lock.unlock();
            }
        }
    }

    public void buzz(Runnable printBuzz) throws InterruptedException {

    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        if (lock.tryLock()) {
            try {

            } finally {

                lock.unlock();
            }
        }
    }

    public void number(IntConsumer printNumber) throws InterruptedException {
        if (lock.tryLock()) {
            try {
                if (n % 3 != 0 && n % 5 != 0) {
                    fizzCondition.signal();
                    buzzCondition.signal();
                    fizzBuzzCondition.signal();
                    printNumber.accept(n);
                }
            } finally {
                lock.unlock();
            }
        }
    }

}
