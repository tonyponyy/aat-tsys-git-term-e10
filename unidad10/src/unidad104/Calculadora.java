package unidad104;

public class Calculadora {
	int a;
	int b;

	public Calculadora(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void calcula(int opcion) {
		 try {
		int num1 = this.a;
		int num2 = this.b;
		double resultado;
		switch (opcion) {
		case 1:
			resultado = num1 + num2;
			System.out.println("Resultado ="+resultado);
			break;
		case 2:
			resultado = num1 - num2;
			System.out.println("Resultado ="+resultado);
			break;
		case 3:
			resultado = num1 * num2;
			System.out.println("Resultado ="+resultado);
		case 4:
			resultado = num1 / num2;
			System.out.println("Resultado ="+resultado);
			break;
		case 5:
			resultado = Math.sqrt(num1);
			System.out.println("Resultado ="+resultado);
			break;

		default:
			System.out.println("Opción no válida.");
			break;
		}
		 } catch (ArithmeticException e) {
		        System.err.println("Error  " + e.getMessage());
		    } catch (IllegalArgumentException e) {
		        System.err.println("Error  " + e.getMessage());
		    }

	}

}