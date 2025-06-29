package advanceTest5;

/**
 * A utility class to simulate tasks with varying performance.
 */
public class PerformanceTester {
	
   public void performTask(long durationMillis) {
       try {
           System.out.println("  [PerformanceTester] Starting task for " + durationMillis + " ms...");
           Thread.sleep(durationMillis); // Simulate work by pausing the thread
           System.out.println("  [PerformanceTester] Task completed.");
       } catch (InterruptedException e) {
           // Restore the interrupted status
           Thread.currentThread().interrupt();
           System.err.println("  [PerformanceTester] Task interrupted!");
       }
   }
}