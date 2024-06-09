package im.mory.java_practice.p001_concurrency;


import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Workers {
    void RunThread() throws InterruptedException {
        Runnable runnable = () -> {
            Workers.this.notify();
        };
        new Thread(runnable).start();
        Workers.this.wait(1_000);
    }

    private Lock lock = new ReentrantLock();

    void syncMethod() {
        try {
            lock.lock();
        } finally {
            lock.unlock();
        }
    }
}

class Workers2 {
    ExecutorService executor = Executors.newFixedThreadPool(2);

    void RunThread() {
        for (int i = 0; i < 20; i++) {
            int finalI = i;
            Runnable runnable = () -> {
                System.out.println(finalI);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            };
            executor.submit(runnable);
        }
        executor.shutdown();
        System.out.println("DONE");
    }

    void RunThreadWithResult() {
        Callable<String> stringCallable = () -> {
            Thread.sleep(2000);
            return "Name";
        };
        Future<String> future = executor.submit(stringCallable);
        try {
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        } finally {
            executor.shutdown();
        }
    }
}
