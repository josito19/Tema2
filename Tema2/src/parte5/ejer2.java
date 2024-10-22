package parte5;

import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		//Creamos el escáner y las variables
		Scanner sc = new Scanner(System.in);
		//Creamos e inicializamos n que almacenará los números		
		int n = 1;
		//Creamos par para comprobar si el número n es par		
		int par;
		//n irá aumentando y el resto de dividirlo entre 2 nos dirá si es par
		do {
			par = ++n % 2;
			//Si el resto de par es 0 mostramos en pantalla n			
			if (par == 0) {
				System.out.println(n);
			}
			//Así hasta que n alcance 200			
		} while (n < 200);
		//Cerramos el escáner
		sc.close();
	}

}
