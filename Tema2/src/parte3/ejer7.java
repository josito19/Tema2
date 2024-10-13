package parte3;

import java.util.Scanner;

public class ejer7 {

	public static void main(String[] args) {
//Creamos el escáner y las variables
		Scanner sc = new Scanner(System.in);
		double distancia;
		int dias;
		double precio;
		double precioFinal;
//Solicitamos al usuario la distancia a recorrer y los días de estancia		
		System.out.println("¿Cuántos km va a recorrer?");
		distancia = sc.nextInt();
		System.out.println("¿Cuántos días va a estar?");
		dias = sc.nextInt();
//Calculamos el precio del billete
		precio = (distancia * 2.5);
//Si la distancia es mayor a 800 km y está más de 7 días hacemos la reducción
		if (distancia > 800 && dias > 7) {
			precioFinal = precio - (precio * 0.3);
		} else {
//Sino el precio no varía			
			precioFinal = precio;
		}
//Mostramos el precio y cerramos el escáner
		System.out.println("El precio de su estancia de es de: " + precioFinal + "€");
		sc.close();
	}

}
