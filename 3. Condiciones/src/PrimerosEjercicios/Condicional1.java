package PrimerosEjercicios;

import java.util.Scanner;

public class Condicional1 {

	public static void main(String[] args) {
		/* Crea un programa que pida un n�mero entero al usuario y d� a una variable par el valor 1 
		 si ese n�mero es par o el valor 0 si no es par. Hazlo primero con un "if" y luego con un "operador condicional". */

		 int n = 4;
	        int par;
	 
	        par = n % 2 == 0 ?  1 : 0;
	 
	        System.out.print( "\"par\" vale... " ); 
	        System.out.println( par ); 
	    }
	}
