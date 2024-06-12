import java.io.File; // IMPORTAR LO NECESARIO PARA TRABAJAR CON ARCHIVOS EN JAVA

public class Carpeta {
	public static void main(String[] args) {
	File archivo = new File("NombreCarpeta"); // PARA CREAR UN ARCHIVO EN LA RUTA DEL PROYECT
	
	if (archivo.mkdir()) { // SE UTILIZA PARA CREAR UNA CARPETA
		System.out.println("El archivo se ha creado correctamente");
	} else {
		System.out.println("El archivo ya existe");
	}
	System.out.println("Que paza picha");
}
}