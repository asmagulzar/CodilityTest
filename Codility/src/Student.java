import java.util.TreeMap;

public class Student implements Comparable<Student> {
	public String name;
	public int regno;
	public int marks;
	
	
 Student(String name ,int regno, int marks){
	 this.name = name;
	 this.regno = regno;
	 this.marks = marks;
	 
	 
 }


@Override
public int compareTo(Student s) {
	// TODO Auto-generated method stub
	return s.marks-this.marks;
}
}
