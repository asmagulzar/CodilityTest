import java.util.HashMap;
import java.util.Scanner;

public class Drink {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> drink = new HashMap<>();
		drink.put("Coke",5);
		drink.put("Pepsi",5);
		drink.put("Fanta",10);
		drink.put("Sprite",0);
		
		
		
		System.out.println("Select One : Coke Pepsi Fanta Sprite");
		
		Scanner s = new Scanner(System.in);
		while(s != null) {
		String dtype = s.next();
		System.out.println("Available Drinks: "+drink.get(dtype));
		int n = drink.get(dtype);
		if(n>0) {
			System.out.println(dtype+" Drink Served");
			drink.put(dtype,n-1);
		}
		else {
			System.out.println(dtype+" Drink Not Available");
		}
		System.out.println("Remaining Drinks: "+drink.get(dtype));
		}
		
	}
		
	
}
