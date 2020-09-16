import java.util.Iterator;
import java.util.TreeSet;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Student> stulist = new TreeSet<>();
		stulist.add(new Student("Asma",1,45));
		stulist.add(new Student("Mehraj",1,75));
		stulist.add(new Student("Armaan",1,95));
		stulist.add(new Student("Zoha",1,85));
		stulist.add(new Student("Kitty",1,20));
		
		Iterator<Student> it= stulist.iterator();
		for(int i=0;i<3;i++) {
		Student tempstu = it.next();
		System.out.println("No."+(i+1)+" Mark is "+tempstu.name);
		}
		
	}

}