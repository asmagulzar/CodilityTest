import java.util.Scanner;
import java.util.Vector;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		v.add("t");
		v.add("e");
		v.add("k");
		v.add("a");
		v.add("r");
		v.add("c");
		v.add("h");
		
		System.out.println("Enter N: ");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=0;i<N;i++) {
			v.add(3,"Z");
		}
		System.out.println("After Adding "+N+" Zs: "+v);
		for(int i=0;i<N;i++) {
			v.remove(6);
		}
		System.out.println("After Removing "+N+" Elements: "+v);
		System.out.println(v);
		sc.close();
		
	}
	

}
