
public class Vehicle implements Comparable<Vehicle>{
	public int number;
	public String model;
	public int duration;
	
	Vehicle (int number,String model,int duration){
		this.number = number;
		this.model = model;
		this.duration = duration;
	}
	@Override
	public int compareTo(Vehicle v) {
		// TODO Auto-generated method stub
		return v.duration-this.duration;
	}
	
	
}
