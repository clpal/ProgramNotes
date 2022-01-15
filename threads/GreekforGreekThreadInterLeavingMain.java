package threads;

public class GreekforGreekThreadInterLeavingMain {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread 1- Number " + i);
                }
            }
        };
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread 2- Number " + i);
                }
            }
        };
        Thread thread1 = new Thread(runnable, "Thread 1-");
        Thread thread2 = new Thread(runnable1, "Thread 2-");
        thread1.start();
        thread2.start();
    }
}
