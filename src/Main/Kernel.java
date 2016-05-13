package Main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Kernel {
	/*
	 *Este es el método kernel, muestra utiliza las clases FileReader para crear el objeto
	 *'lector' y acceder al contenido y BufferedReader para alcenarlo en memoria y luego
	 *pasarlo a una variable (la ariable cadena);  
	 */

	static void muestraContenido(String archivo)throws FileNotFoundException, IOException{
		String cadena;
		FileReader lector = new FileReader(archivo);
		//el lector se bufferea
		BufferedReader buffer = new BufferedReader(lector);
		//se dispara el evento que hace que todo suceda
		while((cadena = buffer.readLine())!= null) {
			System.out.println(cadena);
		}
		buffer.close();
	}

	
	public static void main(String [] argumentos) throws IOException{
		muestraContenido("/home/pachu/Escritorio/prueba.txt");
	}
}
