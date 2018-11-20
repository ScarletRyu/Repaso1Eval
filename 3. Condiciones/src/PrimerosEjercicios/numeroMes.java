package PrimerosEjercicios;

import java.util.Scanner;

public class numeroMes {

	public static void main(String[] args) throws InterruptedException {
		Scanner scan=new Scanner(System.in);
		int opcion;
		
        
       
		do {
			System.out.println("Introduce un numero de menu");
			System.out.println("-------MENU-------");
			System.out.println("1 - ENERO");
			System.out.println("2 - FEBRERO");
			System.out.println("3 - MARZO");
			System.out.println("4 - ABRIL");
			System.out.println("5 - MAYO");
			System.out.println("6 - JUNIO");
			System.out.println("7 - JULIO");
			System.out.println("8 - AGOSTO");
			System.out.println("9 - SEPTIEMBRE");
			System.out.println("10 - OCTUBRE");
			System.out.println("11 - NOVIEMBRE");
			System.out.println("12 - DICIEMBRE");
		    System.out.println("13 - Salir");

			
			opcion = scan.nextInt();
			
			switch(opcion) {
			
			case 1 :
				System.out.println("ENERO ");
				break;
			case 2 :
				System.out.println("FEBRERO ");
				break;
			case 3 :
				System.out.println("MARZO ");
				break;
			case 4 :
				System.out.println("ABRIL ");
				break;
			case 5 :
				System.out.println("MAYO ");
				break;
			case 6 :
				System.out.println("JUNIO ");
				break;
			case 7 :
				System.out.println("JULIO ");
				break;
			case 8 :
				System.out.println("AGOSTO ");
				break;
			case 9 :
				System.out.println("SEPTIEMBRE ");
				break;
			case 10 :
				System.out.println("OCTUBRE ");
				break;
			case 11 :
				System.out.println("NOVIEMBRE ");
				break;
			case 12:
				System.out.println("DICIEMBRE ");
				break;
}
		}while(opcion !=13);
		System.out.println("Fin del programa");
}
	}

