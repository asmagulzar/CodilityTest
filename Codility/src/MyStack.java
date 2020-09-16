import java.util.ArrayList;

public class MyStack {
	   private int size;
	   private ArrayList<Integer> stackArray;
	   private int top;
	   
	   public MyStack() {
	      
	      stackArray = new ArrayList<>();
	      top = -1;
	   }
	   public void push(int j) {
	      stackArray.add(j);
	      top++;
	   }
	   public int pop() {
		  top--;
	      return stackArray.remove(top+1);
	      
	      
	   }
	   public int peek() {
	      return stackArray.get(top);
	   }
	   
	   public int display(int i) {
		      return stackArray.get(i);
		   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  MyStack theStack = new MyStack(); 
	      theStack.push(10);
	      theStack.push(20);
	      theStack.push(30);
	      theStack.push(40);
	      theStack.push(50);
	      System.out.println("Push Completed");
	      
	      System.out.println("Display:");
	      for(int i=0;i<5;i++) {
	    	  System.out.println(theStack.display(i));
	      }
	      
	      System.out.println("Peek:");
	      System.out.println(theStack.peek());
	      
	      
	      
	      
	      System.out.println("Pop: ");
	      for(int i=0;i<5;i++) {
	    	  System.out.println(theStack.pop());
	      }
	      
	          	 
	      
	}

}
