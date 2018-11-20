package PrimerosEjercicios;

import java.util.Scanner;

public class Positivos2 {

	public static void main(String[] args) {
		/* Crea un programa que pida al usuario dos números enteros y diga si al menos uno de los dos es positivo (el primero O el segundo).*/
		Scanner scan = new Scanner(System.in);
		int numero1;
		int numero2;
		
		System.out.println("Introduce el primer numero : ");
		numero1 = scan.nextInt();
		
		System.out.println("Introduce el segundo numero : ");
		numero2 = scan.nextInt();
		
		if (numero1 > 0 ) {
			System.out.print("El numero1 es positivo");
		}else {
			if (numero2 > 0) {
				
		System.out.print("El numero2 es positivo");
		}else {
			System.out.print("Los dos son negativos");
		}

	}

}
}