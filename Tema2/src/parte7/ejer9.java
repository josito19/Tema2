package parte7;

import java.util.Scanner;

public class ejer9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int cont = 0;
		do {
			System.out.println("Introduzca un número:");
			num = sc.nextInt();			
			while (num > 0) {
                num /= 10;
                cont++;
            }
			System.out.println("Tiene " + cont + " cifras.");
		} while (num > 0);
		sc.close();
	}

}
