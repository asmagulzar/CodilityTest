import java.util.ArrayList;

public class Q8 {
	public static void main(String[] args) {
	ArrayList<Employee> emplist = new ArrayList<>();
	emplist.add(new Employee("Asma",1));
	emplist.add(new Employee("Mehraj",2));
	emplist.add(new Employee("Armaan",3));
	emplist.add(new Employee("Zoha",4));
	emplist.add(new Employee("Asma",1));
	emplist.add(new Employee("Mehraj",2));
	
	System.out.println("After adding elements to ArrayList: ");	
	for(int i=0;i<emplist.size();i++) {
	System.out.println(emplist.get(i).name);
	}
	
		
	for(int i=0;i<emplist.size();i++) {
		for(int j=i+1;j<emplist.size();j++) {
			if((emplist.get(i).name).equals(emplist.get(j).name)&&((emplist.get(i).number)==emplist.get(j).number)) {
			emplist.remove(j);
			j--;
			}
				
		
			
		}
	}
	System.out.println("After removing duplicates:");
	for(int i=0;i<emplist.size();i++) {
		System.out.println(emplist.get(i).name);
		}
	}
	
}
