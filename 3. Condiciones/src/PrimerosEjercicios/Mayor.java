package PrimerosEjercicios;

import java.util.Scanner;

public class Mayor {

	public static void main(String[] args) {
		/* Crea un programa que pida dos números reales al usuario y diga cuál es el mayor de ellos. */

		Scanner scan = new Scanner(System.in);
		int numero1;
		int numero2;
		
		System.out.println("Introduce el numero 1 ");
		numero1 = scan.nextInt();
		System.out.println("Introduce el numero 2 ");
		numero2 = scan.nextInt();
		
		if (numero1 > numero2) {
			System.out.print("El numero1 es mayor que el numero2");
			
		}else {
			if (numero1 < numero2) {
				System.out.println("El numero1 es menor que el numero2");
				
				
			}else {
				System.out.println("PA K METES DOS IGUALES SI NO TE LO PIDE SO TONTO MAS QUE TONTO");
			}
			
		}
		
	}

}
