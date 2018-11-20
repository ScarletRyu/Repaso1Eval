package PrimerosEjercicios;

import java.util.Scanner;

public class Positivos {

	public static void main(String[] args) {
		/*  Crea un programa que pida al usuario dos números enteros y diga si los dos son positivos (el primero Y el segundo).*/
		
		Scanner scan = new Scanner(System.in);
		int numero1;
		int numero2;
		
		System.out.println("Introduce el primer numero : ");
		numero1 = scan.nextInt();
		
		System.out.println("Introduce el segundo numero : ");
		numero2 = scan.nextInt();
		
		if ((numero1) > 0 &&  (numero2) > 0) {
			System.out.print("Los numeros 1 y 2 son positivos");
		}else {
			System.out.print("Los numeros 1 y 2 no son positivos");
		}

	}

}
