import java.io.File; // IMPORTAR LO NECESARIO PARA TRABAJAR CON ARCHIVOS EN JAVA
import java.io.IOException;

public class Archivo {
	public static void main(String[] args) {
	File archivo = new File("MiPrimerArchivo.txt"); // PARA CREAR UN ARCHIVO EN LA RUTA DEL PROYECTO HE DE PONER .TXT PARA DAR FORMATO
	// File archivo = new File("E:\\Varios\\Ajustes\\Programas\\Eclipse\\Proyectos\\MiPrimerArchivo.txt"); // PARA CREAR UN ARCHIVO EN LA RUTA QUE YO QUIERAO
	
	try {
		if (archivo.createNewFile()) {
			System.out.println("El archivo se ha creado correctamente");
	} else {
		System.out.println("El archivo ya existe");
	}
	} catch (IOException e) {
		e.printStackTrace (System.out);
		}
}
}