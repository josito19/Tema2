package parte7;

import java.util.Scanner;

public class ejer6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Introduzca un número:");
		num = sc.nextInt();
		
		for (int i = 1;i<=num;i++) {
			for(int j = 1; j <= i - num; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
		
		sc.close();
	}

}
