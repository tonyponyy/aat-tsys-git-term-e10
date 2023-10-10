package excepcion_custom;

public class MiExcepcion extends Exception {
	private int codigo;

	public MiExcepcion(int codigo_input) {
		super();
		this.codigo = codigo_input;
	}

	public MiExcepcion() {
		super();
	}

	@Override
	public String getMessage() {
		String msg = "";

		switch (this.codigo) {
		case 0:
			msg = "El numero no puede ser 0";
			break;
		case 2:
			msg = "El numero es par";
			break;
		case 3:
			msg = "El numero es inpar";
			break;
		}

		return msg;

	}

}
