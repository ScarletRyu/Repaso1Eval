package PrimerosEjercicios;

import java.util.Scanner;

public class DobleIf {

	public static void main(String[] args) {
		/* Crea un programa que pida un número entero al usuario y diga si es positivo (mayor que cero), 
		 * si es negativo (menor que cero) o si, por el contrario, es exactamente 0 */
		 
		Scanner scan = new Scanner(System.in);
		int numero;
		
		System.out.println("Introduce un numero entero: ");
		numero = scan.nextInt();
		
		if (numero > 0) {
			System.out.print("El numero introducido es positivo ");
		
		}else if ( numero < 0) {
			System.out.print("El numero introducido es negativo ");
		
		
		}else {
			System.out.print("El numero es 0");
		
		
	}
}
}
