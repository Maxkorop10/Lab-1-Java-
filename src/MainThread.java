public class MainThread extends Thread {
    
    private final int id;
    private final BreakThread breakThread;

    public MainThread(int id, BreakThread breakThread) {
        this.id = id;
        this.breakThread = breakThread;
    }

    @Override
    public void run() {
        long sum = 0;
        int step = 2;
        int count = 0;

        while (!breakThread.isCanBreak()) {
            sum += count * step;
            count++;
        }

        System.out.println("Thread: " + id + " - Sum: " + sum + " - Count: " + count);
    }
}
