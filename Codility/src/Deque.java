import java.util.Iterator;
import java.util.LinkedList;

public class Deque {
	private LinkedList<Integer> ll;
	Iterator<Integer> it;
	
	public Deque() {
		ll = new LinkedList<>();
	}
	
	public void addFirst(int n) {
		ll.addFirst(n);
	}
	
	public void addLast(int n) {
		ll.addLast(n);
	}
	public int pollFirst() {
		return ll.removeFirst();
	}
	
	public int pollLast() {
		return ll.removeLast();
	}
	
	
	public static void main(String[] args) {
		Deque dq = new Deque();
		dq.addFirst(1);
		dq.addFirst(2);
		dq.addLast(3);
		dq.addLast(4);
		
		System.out.println(dq.pollFirst());
		System.out.println(dq.pollLast());
		
		
		
	}

}
