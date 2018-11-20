package PrimerosEjercicios;

import java.util.Scanner;

public class Pares {

	public static void main(String[] args) {
		/* Crea un programa que pida al usuario dos números enteros y cuántos de ellos son pares.*/
		
		Scanner scan = new Scanner(System.in);
		int numero1;
		int numero2;
		
		System.out.println("Introduce el primer numero : ");
		numero1 = scan.nextInt();
		
		System.out.println("Introduce el segundo numero : ");
		numero2 = scan.nextInt();

		if((numero1 % 2 == 0) && (numero2 % 2 == 0)) {
			System.out.print("Los numeros 1 y 2 son pares");
			
			}else {
				System.out.print("Los dos son impares");
			}
		}
	

}
