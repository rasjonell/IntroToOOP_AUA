package class02;

import java.util.Scanner;

public class TrickyNumGuess {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		
		while(input.hasNext()) {
			sum += input.nextInt();
		}
		input.close();
		System.out.println(9 - sum % 9);
	}

}
