import java.util.ArrayList;
import java.util.Iterator;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArrayList<Student> al = new MyArrayList<>();
		
		al.add(new Student("Asma",1,75));
		al.add(new Student("Mehraj",2,65));
		al.add(new Student("Armaan",3,95));
		al.add(new Student("Zoha",4,85));
		al.add(new Student("Kitty",5,70));
		
		Iterator<Student> it = al.iterator();
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i).name);
		}
	}

}
