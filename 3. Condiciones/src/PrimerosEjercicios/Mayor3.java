package PrimerosEjercicios;

import java.util.Scanner;

public class Mayor3 {

	public static void main(String[] args) {
		/* Crea un programa que pida tres números enteros largos al usuario y diga cuál es el mayor de los tres. */

		Scanner scan = new Scanner(System.in);
		int numero1;
		int numero2;
		int numero3;
		
		System.out.println("Introduce el primer numero : ");
		numero1 = scan.nextInt();
		
		System.out.println("Introduce el segundo numero : ");
		numero2 = scan.nextInt();
		
		System.out.println("Introduce el tercer numero : ");
		numero3 = scan.nextInt();
		
		if (numero1 > numero2 &&  numero1 > numero3) 
		{
			System.out.println("El numero1 es el mayor de los 3");
			
		}
		else 
		{
			if(numero2 > numero3)
			{
				System.out.println("El numero2 es el mayor de los 3");
			}
			else 
			{
				System.out.println("El numero3 es el mayor de los 3");
				
			}
		}
		}
	}


