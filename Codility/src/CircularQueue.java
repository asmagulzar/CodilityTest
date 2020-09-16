import java.util.ArrayList;

public class CircularQueue {
	private int size, front, rear; 
	private ArrayList<Integer> queue = new ArrayList<Integer>(); 
	
	// Constructor 
	CircularQueue(int size) 
	{ 
	    this.size = size; 
	    this.front = this.rear = -1; 
	} 
	// Method to insert a new element in the queue. 
	public void enQueue(int data) 
	{ 
	      
	    // Condition if queue is full. 
	    if((front == 0 && rear == size - 1) || 
	      (rear == (front - 1) % (size - 1))) 
	    { 
	        System.out.print("Queue is Full"); 
	        
	    } 
	  
	    // condition for empty queue. 
	    else if(front == -1) 
	    { 
	        front = 0; 
	        rear = 0; 
	        queue.add(rear, data); 
	    } 
	  
	    else if(rear == size - 1 && front != 0) 
	    { 
	        rear = 0; 
	        queue.set(rear, data); 
	    } 
	  
	    else
	    { 
	        rear = (rear + 1); 
	      
	        // Adding a new element if  
	        if(front <= rear) 
	        { 
	            queue.add(rear, data); 
	        } 
	      
	        // Else updating old value 
	        else
	        { 
	            queue.set(rear, data); 
	        } 
	    } 
	} 

public int deQueue() 
{ 
    int temp; 
  
    // Condition for empty queue. 
    if(front == -1) 
    { 
        System.out.print("Queue is Empty"); 
          
        // Return -1 in case of empty queue 
        return -1;  
    } 
  
    temp = queue.get(front); 
  
    // Condition for only one element 
    if(front == rear) 
    { 
        front = -1; 
        rear = -1; 
    } 
  
    else if(front == size - 1) 
    { 
        front = 0; 
    } 
    else
    { 
        front = front + 1; 
    } 
      
    // Returns the dequeued element 
    return temp; 
} 
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CircularQueue q = new CircularQueue(5); 
	      
	    q.enQueue(1); 
	    q.enQueue(2); 
	    q.enQueue(3); 
	    q.enQueue(4); 
	    q.enQueue(5); 
	    
	    
	    q.deQueue();
	    q.deQueue();
	    q.deQueue();
	    
	    q.enQueue(7); 
	    q.enQueue(8); 
		

	}

}
