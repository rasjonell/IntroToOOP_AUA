package class02;

import java.util.Scanner;

public class PiGuess {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int terms = input.nextInt();
		double sum1 = 0, sum2 = 0;
		
		for(int pos=1; pos < terms * 2; pos+=4) {
			sum1 += 1. / pos;
		}
		
		for(int neg=3; neg < terms * 2; neg+=4) {
			sum2 += 1. / neg;
		}
		
		System.out.println(4*(sum1 - sum2));
	}

}
