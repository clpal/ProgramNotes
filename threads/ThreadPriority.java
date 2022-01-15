package threads;

public class ThreadPriority extends  Thread{
    @Override
    public void run() {
        System.out.println("Inside run method");
    }

    public static void main(String[] args) {
        Thread.currentThread().setPriority(6);
        System.out.println("main thread priority : "
                + Thread.currentThread().getPriority());
        ThreadPriority t1=   new ThreadPriority();
        System.out.println("\"t1 thread priority :"
                + t1.currentThread().getPriority());
    }
}
