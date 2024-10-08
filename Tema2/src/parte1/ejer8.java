package parte1;

import java.util.Scanner;

public class ejer8 {

	public static void main(String[] args) {
//Creamos el escáner y las variables
		Scanner sc = new Scanner(System.in);
		float n;
//Pedimos el número real y lo asignamos
		System.out.println("Introduzca su nota:");
		n = sc.nextInt();
//Si la nota está entre 0 y 5, 0 incluído, será un insuficiente
		if (n >= 0 && n < 5) {
			System.out.println("Tienes un insuficiente");
//Si la nota está entre un 5 y un 6,sin incluir el 6, tendrá un suficiente	
		} else {
			if (n >= 5 && n < 6) {
				System.out.println("Tienes un suficiente");
//Si la nota es un 6 o menos que 7 tiene un bien	
			} else {
				if (n >= 6 && n < 7) {
					System.out.println("Tienes un bien");
//Si la nota es un 7 o menor que 9 tiene un notable	
				} else {
					if (n >= 7 && n < 9) {
						System.out.println("Tienes un notable");
					} else {
/*
* No hace falta calcular el último ya que solo faltan el 9 y el 10 por definir
* suponiendo que el usuario introduzca numeros entre el 0 y el 10
 */
						System.out.println("Tienes un sobresaliente");
					}

				}

			}

		}

		sc.close();
	}

}
