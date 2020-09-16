
public class Railway {

		// TODO Auto-generated method stub

	public static void main(String[] args) {
		
		RailwayReservation r = new RailwayReservation();
		
        
        Thread thread1=new Thread(r,"Passenger1 Thread");
        Thread thread2=new Thread(r,"Passenger2 Thread");
        Thread thread3=new Thread(r,"Passenger3 Thread");
        Thread thread4=new Thread(r,"Passenger4 Thread");
        
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
	}
	

}
