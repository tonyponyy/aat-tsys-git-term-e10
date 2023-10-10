package unidad105;

import java.util.Scanner;


public class mainapp {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Cuantas contraseñas quieres :");
			int num_array = sc.nextInt();
			System.out.println("Cuantos digitos quieres :");
			int num_digitos = sc.nextInt();
			Password contraseña = new Password(num_digitos);
			 String contraseñas[] = new String[num_array] ;
			 Boolean seguras[] = new Boolean[num_array];
			
			for (int i = 0; i < contraseñas.length; i++) {
				contraseña.generarPassword();
				contraseñas[i] = contraseña.getContraseña();
				seguras[i] = contraseña.esfuerte();	
				System.out.println(contraseña.getContraseña()+" "+contraseña.esfuerte());
			}
			 sc.close();
			
		}catch(Exception e){
			System.out.println("Se ha producido un Error, vuelva a intentarlo en unos minutos.");
		}
	
	}

}
