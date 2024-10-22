package parte5;

import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		//Creamos el escáner y las variables
		Scanner sc = new Scanner(System.in);
		//Creamos la variable n y la inicializamos		
		int n = 0;
		//Se aumentará n en uno cada vez y se mostrará en pantalla 		
		do {
			System.out.println(++n);
			//Cuando llegue a 20 se parará			
		} while (n < 20);
		//Cerramos el escáner		
		sc.close();
	}

}
