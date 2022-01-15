package threads;

import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    AtomicInteger count = new AtomicInteger();

    public void increment() {
        //count.getAndIncrement();
        count.incrementAndGet();
    }
}

public class AtomicThread {
    public static void main(String[] args) throws InterruptedException
    {
        Counter c = new Counter();
        Thread t1 = new Thread(
                new Runnable() {
                    public void run()
                    {
                        for (int i = 1; i <= 2000; i++) {
                            c.increment();
                        }
                    }
                });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <=2000 ; i++) {
                    c.increment();
                }

            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(c.count);

    }
}
