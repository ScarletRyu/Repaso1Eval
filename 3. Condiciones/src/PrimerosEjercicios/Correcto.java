package PrimerosEjercicios;

import java.util.Scanner;

public class Correcto {

	public static void main(String[] args) {
		/* Crea un programa que pida al usuario que introduzca el número 12. Después debe decirle si lo ha hecho correctamente o no. */
		
		Scanner scan = new Scanner(System.in);
		int numero;
		
		System.out.print("Introduce el numero 12 = ");
		 numero = scan.nextInt();
	
		if (numero == 12) {
			System.out.println("El numero introducido es el 12 ");
		}else {
			
			System.out.println("No eres mas tonto por que no te entrenas campeon");
		}

	}

}
