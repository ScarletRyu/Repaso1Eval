package PrimerosEjercicios;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		/* Crea un programa que diga si el número introducido por el usuario es impar o no lo es. */

		Scanner scan = new Scanner(System.in);
		int numero;
		
		System.out.println("Introduce un numero: ");
		numero = scan.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("El numero introducido es par");
		}else {
			System.out.print("El numero introducido es impar");
		}
	}

}
