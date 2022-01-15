package threads;

public class VolatileExample {
    volatile static int a = 0, b = 0;

    public static void method_one() {
        a++;
        b++;
    }

    public static void method_two() {
        System.out.println("a=" + a + " b=" + b);
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    method_one();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    method_two();
                }
            }
        });
        t1.start();
        t2.start();
    }

}
