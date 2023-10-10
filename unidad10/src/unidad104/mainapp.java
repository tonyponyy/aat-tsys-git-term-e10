package unidad104;

import java.util.Scanner;

public class mainapp {
	public static void main(String[] args) {
		boolean fin = false;
		Scanner sc = new Scanner(System.in);
		while (!fin) {
			System.out.println("Introduzca numero 1- Para suma");
			System.out.println("Introduzca numero 2- Para resta");
			System.out.println("Introduzca numero 3- Para multiplicación");
			System.out.println("Introduzca numero 4- Para división");
			System.out.println("Introduzca numero 5- Para raiz cuadrada");
			System.out.println("Introduzca numero 6- Para salir");
			int opcion = sc.nextInt();
			if (opcion != 6) {
				System.out.println("Introduzca numero A");
				int a = sc.nextInt();
				System.out.println("Introduzca numero A");
				int b = sc.nextInt();
				Calculadora calculadora = new Calculadora(a, b);
				calculadora.calcula(opcion);
			} else {
				fin = true;
				System.out.println("Adiós");
			}
		}
		sc.close();
	}
}
