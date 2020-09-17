
public class RailwayReservation extends Thread{
	static int ticketsAvailable=10;
	private int ticketsNeeded;
	private String name;
	
	
	
	RailwayReservation(int ticketsNeeded, String name){
		this.ticketsNeeded = ticketsNeeded;
		this.name = name;
	}
		
	
	static synchronized void BookTicket(int ticketsNeeded, String name ) {
		 if(ticketsNeeded<=ticketsAvailable && ticketsAvailable >0){
		 		
             System.out.println("Booking ticket for : "+ name);
             
             //Let's say system takes some time in booking ticket (here we have taken 1 second time)
             try{
                    Thread.sleep(2000); 
             }catch(Exception e){}
               
             ticketsAvailable=ticketsAvailable-ticketsNeeded;
             System.out.println("Ticket BOOKED for : "+ name +" Remaining Tickets= "+ticketsAvailable);
	 		
	 		}         
		 else
             System.out.println("Ticket NOT BOOKED for : "+name);
		 
	 }
	
	

	       	 
        
	        
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Inside Run");
		System.out.println("Waiting to book ticket for : "+Thread.currentThread().getName());
		 
		BookTicket(ticketsNeeded,name);
		
	}
		     
		
	
	public static void main(String[] args) {
		
		RailwayReservation r1 = new RailwayReservation(5, "Passenger1");
		RailwayReservation r2 = new RailwayReservation(2, "Passenger2");
		RailwayReservation r3 = new RailwayReservation(8, "Passenger3");
		RailwayReservation r4 = new RailwayReservation(5, "Passenger4");
		
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		
		
		
		
		
		
	}

}

/*
 class SeatReservation
{
    public static void main(String[] args)
    {
        Reservation reserve = new Reservation(); // LINE A
        Person thread1 = new Person(reserve, 5); // LINE B
        thread1.start();
        Person thread2 = new Person(reserve, 4);
        thread2.start();
        Person thread3 = new Person(reserve, 2);
        thread3.start();
    }
}

class Reservation
{

    static int availableSeats = 10;

    synchronized void reserveSeat(int requestedSeats) // LINE D
    {
        System.out.println(Thread.currentThread().getName() + " entered.");
        System.out.println("Availableseats : " + availableSeats + " Requestedsetas : " + requestedSeats);
        if (availableSeats >= requestedSeats)
        {
            System.out.println("Seat Available. Reserve now :-)");
            try
            {
                Thread.sleep(100);     // LINE E
            }
            catch (InterruptedException e)
            {
                System.out.println("Thread interrupted");
            }
            System.out.println(requestedSeats + " seats reserved.");
            availableSeats = availableSeats - requestedSeats;
        }
        else
        {
            System.out.println("Requested seats not available :-(");
        }
        System.out.println(Thread.currentThread().getName() + " leaving.");
        System.out.println("----------------------------------------------");
    }
}

class Person extends Thread
{

    Reservation reserve;
    int requestedSeats;

    public Person(Reservation reserve, int requestedSeats)
    {
        this.reserve = reserve;
        this.requestedSeats = requestedSeats;
    }

    @Override
    public void run() // LINE C
    {
        reserve.reserveSeat(requestedSeats);
    }
}

*/



	
	

	


