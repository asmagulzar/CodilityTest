;
public class ThreadSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SeqRun sr = new SeqRun();
		  // Three threads
		  Thread t1 = new Thread(sr);
		  Thread t2 = new Thread(sr);
		  Thread t3 = new Thread(sr);
		  
		  try {
		   // First thread
		   t1.start();
		   t1.join();
		   // Second thread
		   t2.start();
		   t2.join();
		   // Third thread
		   t3.start();
		   t3.join();
		  } catch (InterruptedException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  }
	}
}