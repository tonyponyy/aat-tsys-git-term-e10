package unidad101;

import java.util.InputMismatchException;
import java.util.Scanner;

public class mainapp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Juego juego = new Juego();
		while (juego.puede_jugar()) {
			try {
				System.out.println("Introduce numero :");
				juego.partida(sc.nextInt());
			} catch (InputMismatchException e) {
				juego.restarIntentos();
				System.out.println("Numero incorrecto, restado un intento.");
				sc.nextLine();
			}
		}
		if (juego.getIntentos() < 1) {
			System.out.println("Has perdido !");
		}
		System.out.println("Fin del juego");
		sc.close();
	}
}
