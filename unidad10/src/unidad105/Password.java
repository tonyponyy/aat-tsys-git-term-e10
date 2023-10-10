package unidad105;

import java.util.Random;

class Password {
	
    private int longitud;
    private String contraseña;
    private final int LONGITUD_DEFECTO = 8;

    public Password() {
        this.longitud = LONGITUD_DEFECTO;
        generarPassword();
    }

    public Password(int longitud) {
        this.longitud = longitud;
        generarPassword();
    }

    public boolean esfuerte() {
        int may = 0;
        int min = 0;
        int nums = 0;

        for (int i = 0; i < contraseña.length(); i++) {
            char caracter = contraseña.charAt(i);
            if (Character.isUpperCase(caracter)) {
                may++;
            } else if (Character.isLowerCase(caracter)) {
                min++;
            } else if (Character.isDigit(caracter)) {
                nums++;
            }
        }
        return may > 2 && min > 1 && nums > 5;
    }

    public void generarPassword() {
    	String temp_contraseña = "";
        for (int i = 0; i < longitud; i++) {
            int Asciichar = (int) (48+(Math.random() * (126-48)));
            char caracter = (char) Asciichar;
            temp_contraseña += caracter;
        }
        contraseña = temp_contraseña;
    }

    public String getContraseña() {
        return contraseña;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
        generarPassword();
    }
}
