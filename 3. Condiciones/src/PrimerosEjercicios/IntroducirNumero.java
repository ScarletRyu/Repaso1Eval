package PrimerosEjercicios;

import java.util.Scanner;

public class IntroducirNumero {

		public static void main(String[] args) throws InterruptedException {
			
			/* Crea un programa que escriba como texto cualquier número del 1 al 10 que introduzca el usuario.
			 *  Por ejemplo, si el usuario introduce 3, deberá escribir "tres". */
			
			Scanner scan=new Scanner(System.in);
			int opcion;
			
	        
	       
			do {
				System.out.println("Introduce un numero de menu");
				System.out.println("-------MENU-------");
				System.out.println("1 - ");
				System.out.println("2 - ");
				System.out.println("3 - ");
				System.out.println("4 - ");
				System.out.println("5 - ");
				System.out.println("6 - ");
				System.out.println("7 - ");
				System.out.println("8 - ");
				System.out.println("9 - ");
				System.out.println("10 - ");
			    System.out.println("11 - Salir");

				
				opcion = scan.nextInt();
				
				switch(opcion) {
				
				case 1 :
					System.out.println("UNO ");
					break;
				case 2 :
					System.out.println("DOS ");
					break;
				case 3 :
					System.out.println("TRES ");
					break;
				case 4 :
					System.out.println("CUATRO ");
					break;
				case 5 :
					System.out.println("CINCO ");
					break;
				case 6 :
					System.out.println("SEIS ");
					break;
				case 7 :
					System.out.println("SIETE ");
					break;
				case 8 :
					System.out.println("OCHO ");
					break;
				case 9 :
					System.out.println("NUEVE ");
					break;
				case 10 :
					System.out.println("DIEZ ");
					break;
				
	}
			}while(opcion !=11);
			System.out.println("Fin del programa");
	}
		

	}


