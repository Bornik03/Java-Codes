class lab103 {
    public static void main(String[] args) {
        Object lock = new Object();

        Thread thread1 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread 1: I");
                System.out.println("Thread 1: Love");
                System.out.println("Thread 1: You");
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread 2: I");
                System.out.println("Thread 2: Love");
                System.out.println("Thread 2: You");
            }
        });

        thread1.start();
        thread2.start();
    }
}
