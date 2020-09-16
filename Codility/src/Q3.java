import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Vehicle> VList1 = new ArrayList<>();
		VList1.add(new Vehicle(5231,"Audi",60));
		VList1.add(new Vehicle(5121,"BMW",6));
		VList1.add(new Vehicle(9851,"Tesla",40));
		
		ArrayList<Vehicle> VList2 = new ArrayList<>();
		VList2.add(new Vehicle(2331,"Kia",10));
		VList2.add(new Vehicle(9117,"Audi",20));
		VList2.add(new Vehicle(8342,"BMW",35));
		VList2.add(new Vehicle(9123,"SantaFe",10));
		
		ArrayList<Vehicle> MergedList = new ArrayList<>();
		MergedList.addAll(VList1);
		MergedList.addAll(VList2);
		
		Collections.sort(MergedList);
		
		System.out.println("Car with highest parked hours is "+MergedList.get(0).number+" "+MergedList.get(0).model);
		
	
	/*for(int i=0;i<l1.size();i++){
        l3.add(l1.get(i));
      }
      for(int i=0;i<l2.size();i++){
        l3.add(l2.get(i));
	  }*/
		
	}

}
