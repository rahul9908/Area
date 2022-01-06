import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
 
class Main
{
    private static void run() {
        System.out.println("Running: " + new java.util.Date());
    }
 
    public static void main(String[] args)
    {
        ScheduledExecutorService tarun;
       tarun = Executors.newSingleThreadScheduledExecutor();
       tarun.scheduleAtFixedRate(Main::run, 0, 2, TimeUnit.SECONDS);
    }
}
