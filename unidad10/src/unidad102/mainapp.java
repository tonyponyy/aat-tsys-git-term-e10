package unidad102;

import excepcion_custom.MiExcepcion;

public class mainapp {
	public static void main(String[] args) {
		int num = 0;
		try {
			if (num == 0) {
				System.out.println("Lanzando una excepción:");
				throw new MiExcepcion(0);
			}
		} catch (MiExcepcion e) {
			System.out.println("El mensaje de la excepcion es -->" + e.getMessage());
		}
	}
}
