package completablefuture.async;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class WhyNotFuture {
	public static void main(String[] args) throws InterruptedException, ExecutionException  {
		ExecutorService service = Executors.newFixedThreadPool(10);
		Future<List<Integer>> future = service.submit(()->{
			
			//you are doing API call
			System.out.println("Thread : "+Thread.currentThread().getName()); 
			dalay(1);
			return Arrays.asList(1,2,3,4,5);
		});
		
		List<Integer>list = future.get();
		System.out.println(list); 
	}

	private static void dalay(int min) {
		try {
			TimeUnit.MINUTES.sleep(min);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
