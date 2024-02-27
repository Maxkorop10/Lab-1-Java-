import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        double[] array = {1, 2, 3, 4, 5};
        
        BreakThread breakThread = new BreakThread();
        
        for (int i = 1; i <= array.length; i++) {
            new MainThread(i, breakThread).start();
        }

        // new MainThread(1, breakThread).start();
        // new MainThread(2, breakThread).start();
        // new MainThread(3, breakThread).start();
        // new MainThread(4, breakThread).start();

        new Thread(breakThread).start();
    }
}
