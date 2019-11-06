import java.util.ArrayList;
import java.util.Collections;
import java.lang.Runtime;

class Main{


	public static void main(String args[]){
		TaskQueue t = new TaskQueue();
		ResultTable rt = new ResultTable();

		int proc = Runtime.getRuntime().availableProcessors();
		long duration = System.currentTimeMillis();

		try{

			Thread[] threads = new Thread[proc];
			for(int i = 0; i < proc-1; i++){
				threads[i] = new Thread(new WorkerThread(t, rt));
				threads[i].start();
			}	

			for(int i = 0; i < proc-1; i++){
				threads[i].join();
			}

			rt.printHashMap();
			duration = System.currentTimeMillis() - duration;

			System.out.println("\nPi Computation took " + duration + " ms");

		}catch (Exception e){
			System.err.println(e);
		}

	}

}
