
public class RailwayReservation implements Runnable{
	static int ticketsAvailable=10;
	int ticketsNeeded;
	static Object lock=new Object();
	
	RailwayReservation(int ticketsNeeded){
		this.ticketsNeeded = ticketsNeeded;
	
	}
	synchronized void BookTicket(int ticketsNeeded) {
		 if(ticketsNeeded<=ticketsAvailable && ticketsAvailable >0){
		 		
             System.out.println("Booking ticket for : "+Thread.currentThread().getName());
             
             //Let's say system takes some time in booking ticket (here we have taken 1 second time)
             try{
                    Thread.sleep(2000); 
             }catch(Exception e){}
               
             ticketsAvailable=ticketsAvailable-ticketsNeeded;
             System.out.println("Ticket BOOKED for : "+ Thread.currentThread().getName()+" Remaining Tickets= "+ticketsAvailable);
	 		
	 		} 
         
else{
             System.out.println("Ticket NOT BOOKED for : "+ 
                       Thread.currentThread().getName());
       }
		
       
		
		
	}
	@Override
	synchronized public void run() {
		// TODO Auto-generated method stub
		 System.out.println("Waiting to book ticket for : "+Thread.currentThread().getName());
		 
         
        	 
        
	}
         
         
		
	
public static void main(String[] args) {
		
		RailwayReservation r = new RailwayReservation(5);
		//RailwayReservation r2 = new RailwayReservation(1);
		//RailwayReservation r3 = new RailwayReservation(3);
		//RailwayReservation r4 = new RailwayReservation(8);
		
        
        Thread thread1=new Thread(r,"Passenger1");
        Thread thread2=new Thread(r,"Passenger2");
        Thread thread3=new Thread(r,"Passenger3");
        Thread thread4=new Thread(r,"Passenger4");
        
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
	}
	
	
	

	

}
