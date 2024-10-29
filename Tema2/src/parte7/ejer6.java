package parte7;

import java.util.Scanner;

public class ejer6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Introduzca un número:");
		num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
            // Imprimir espacios en blanco
            for (int j = num - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Imprimir asteriscos con espacio entre ellos
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
		}
		
		
		sc.close();
	}

}
