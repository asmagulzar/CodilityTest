import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Q1 {
	public static void main(String[] args) {
		TreeMap<String,Integer> stulist = new TreeMap<>();
		stulist.put("Asma",1);
		stulist.put("Mehraj",2);
		stulist.put("Armaan",3);
		stulist.put("Zoha",4);
		stulist.put("Kitty",5);
		
		Set<Map.Entry<String,Integer>> entries = stulist.entrySet();
		for(Map.Entry<String,Integer> entry : entries){
            System.out.println( entry.getKey() + "->" + entry.getValue() );
         
        }
			
		
	}
	
	

}

