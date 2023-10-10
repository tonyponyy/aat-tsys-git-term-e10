package unidad101;

public class Juego {
	int INTENTOS_DEFECTO = 10;

	int num;
	int intentos;
	boolean partida_acabada;

	public Juego() {
		this.num = (int) (Math.random() * 500);
		this.intentos = INTENTOS_DEFECTO;
		this.partida_acabada = false;
	}

	public void partida(int num_usuario) {
        if (num_usuario > this.num) {
            this.intentos--;
            System.out.println("El número introducido es más grande, intentos restantes: " + intentos);
        } else if (num_usuario < this.num) {
            this.intentos--;
            System.out.println("El número introducido es más pequeño, intentos restantes: " + intentos);
        } else {
        	this.partida_acabada = true;
            System.out.println("¡Has ganado!, intentos usados: " + (INTENTOS_DEFECTO - intentos));
        }
    }
	
	public int getIntentos() {
		return intentos;
	}
	
	public void restarIntentos() {
		this.intentos--;
	}
	
	public boolean puede_jugar(){
		return !this.partida_acabada && this.intentos > 0;
	}

}
