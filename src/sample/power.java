package sample;

import java.util.Scanner;

public class power {
	public static void main(String[] args) {
		int num_val;
		int power = 1;
		// Take user input
		System.out.println("Enter an number");
		Scanner sc = new Scanner(System.in);
		num_val = sc.nextInt();
		System.out.println("2^0 "+1);
		2
		for(int i=1; i<=num_val; i++) {
			 power = 2*power;
			System.out.println("2^" +i+" "+power);
		}
	}	

}
