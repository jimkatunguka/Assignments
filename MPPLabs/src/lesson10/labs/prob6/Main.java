package lesson10.labs.prob6;

public class Main {
	
	static int n=1;

	public static void main(String[] args) {
		ThreadSafeQueue tsq = new ThreadSafeQueue();
		
		Runnable enquee = ()->{
			tsq.add(n++);
		};
		
		Runnable dequee = ()->{
			System.out.println(tsq.remove());
		};
		
		for(int i=0; i<10; i++) {
			Thread thread = new Thread(enquee);
			thread.start();
		}
		
		for(int i=0; i<10; i++) {
			Thread thread = new Thread(dequee);
			thread.start();
		}

	}

}
