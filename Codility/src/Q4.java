import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 5 numbers: ");
		Scanner sc =  new Scanner(System.in);
		TreeSet<Integer> ts = new TreeSet<>();
		for(int i=0;i<5;i++) {
			int a = sc.nextInt();
			if(!ts.add(a)) {
				System.out.println("Duplicate.Enter another number: ");
				i=i-1;
				continue;
			}
			ts.add(a);
		}
		
		Iterator<Integer> it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
