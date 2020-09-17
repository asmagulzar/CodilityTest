
public class MyTask extends Thread{
	Thread myThread;
	private String name;
	
	MyTask(String name){
		this.name = name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread Running"+ name);
		for(int i = 0 ;i<4;i++) {
			System.out.println(i);
			System.out.println(name);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTask t1 = new MyTask("Thread 1");
		MyTask t2 = new MyTask("Thread 2");
		MyTask t3 = new MyTask("Thread 3");
		
		t1.start();
		t2.start();
		t3.start();
	}
	

}
