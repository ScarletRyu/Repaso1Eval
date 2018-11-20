package PrimerosEjercicios;

import java.util.Scanner;

public class Condicional2 {

	public static void main(String[] args) {
		/* Crea un programa que pida dos números de tipo byte al usuario y cree a una variable "menor", que tenga el valor del menor de esos dos números.
		Hazlo primero con un "if" y luego con un "operador condicional". */
		
		Scanner scan = new Scanner(System.in);
		
		byte x;
		byte y;
		int menor;
		
		System.out.print("Introduce el numero 1: ");
		x = scan.nextByte();
		
		System.out.print("Introduce el numero 2: ");
		y = scan.nextByte();
		
		menor = x < y ?  x : y;
		System.out.println("El numero menor es: " +menor);
		
		
		
		
		

	}

}
