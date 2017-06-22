package assignment32;

import java.util.Scanner;

public class SumWithout {
	
	static int add(int a, int b){
		int carry ;
		while (b!=0){
			carry =a&b;
			a = a^b;
			b = carry <<1;
			
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the values of a,b");
		int a= sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("summ of values is "+add(a,b));
		
	
		

	}

}
