class CounterThread extends Thread {
    private String name;
    private int lowerRange;
    private int upperRange;

    public CounterThread(String name, int lowerRange, int upperRange) {
        this.name = name;
        this.lowerRange = lowerRange;
        this.upperRange = upperRange;
    }

    public void run() {
        System.out.println("Thread - " + name);
        for (int i = lowerRange; i <= upperRange; i++) {
            System.out.println("Counter - " + i);
            try {
                Thread.sleep(5); // Sleep for 5 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class lab102
{
    public static void main(String[] args) {
        String name = "First";
        int lowerRange = 10;
        int upperRange = 15;
        CounterThread counterThread = new CounterThread(name, lowerRange, upperRange);
        counterThread.start();
    }
}

/*public int getPriority(): returns the priority of the thread.
public int setPriority(int priority): changes the priority of the thread.
public String getName(): returns the name of the thread.
public void setName(String name): changes the name of the thread.
public int getId(): returns the id of the thread.
public boolean isAlive(): tests if the thread is alive.
public void yield(): causes the currently executing thread object to temporarily pause and allow other threads to execute.
public void suspend(): is used to suspend the thread(depricated).
public void resume(): is used to resume the suspended thread(depricated).
public void stop(): is used to stop the thread(depricated).
public boolean isInterrupted(): tests if the thread has been interrupted.
 */