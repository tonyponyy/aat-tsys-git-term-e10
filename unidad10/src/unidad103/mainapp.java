package unidad103;

import excepcion_custom.MiExcepcion;

public class mainapp {
	public static void main(String[] args) {
		Num num = new Num(1,500);
		try {
			if (num.es_par()) {
				throw new MiExcepcion(2);
			}else {
				throw new MiExcepcion(3);
			}
		} catch (MiExcepcion e) {
			System.out.println("El mensaje de la excepcion es -->" + e.getMessage());
		}
	}

}
