package PrimerosEjercicios;

import java.util.Scanner;

public class Modulo3 {

	public static void main(String[] args) {
		/* Crea un programa que pida al usuario y diga si ese número es múltiplo de 3 */
		
		Scanner scan = new Scanner(System.in);
		int numero;
		
		System.out.println("Introduce un numero que sea multiplo de 3: ");
		numero = scan.nextInt();
		
		if (numero % 3 == 0) {
			System.out.println("El numero introducido es multiplo de 3");
			
		}else {
			System.out.print("El numero no es multiplo de 3");
		}

	}

}
