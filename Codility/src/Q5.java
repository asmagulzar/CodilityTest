import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the money in cents: ");
		Scanner sc =  new Scanner(System.in);
		int cents = sc.nextInt();
		int dollars=0,quarters=0,dimes=0,nickels=0,pennies=0,coins=0;
		if(cents>=100) {
			dollars=cents/100;
			cents=cents%100;
			
		}
		if(cents>=25) {
			quarters=cents/25;
			cents=cents%25;
			
		}
		if(cents>=10) {
			dimes=cents/10;
			cents=cents%10;
			
		}
		if(cents>=5) {
			nickels=cents/5;
			cents=cents%5;
			
		}
		coins = dollars+quarters+dimes+nickels+cents ;
		System.out.println(dollars+" dollars +  "+quarters+" quarters + "+dimes+" dimes + "+" "+nickels+" nickels + "+cents+" cents + "+"= "+coins+" coins");

	}

}
