import java.util.Stack;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>  A = new Stack<>();
		Stack<Integer>  B = new Stack<>();
		Stack<Integer>  C = new Stack<>();
		
		int  discs=3;
		for(int i=3;i>0;i--) {
			A.push(i);
		}
		
		playHanoi (discs,A,B,C);
		
		System.out.println("B: ");
		for(int i=0;i<discs;i++) {
			System.out.println(B.pop());
		}
				
	}
	 private static void playHanoi(int n, Stack<Integer> a , Stack<Integer> b, Stack<Integer> c) {
	     String  A = "a", B = "b" ,C = "c";
		 if (n == 0)
	            return;
	        if (n > 0) {
	        playHanoi(n-1, a, c, b);   
	        b.push(a.pop());
	        playHanoi(n-1, c, b, a);
	        }
	    }

}
