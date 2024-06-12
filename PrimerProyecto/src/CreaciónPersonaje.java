import java.util.Scanner;

public class CreaciónPersonaje {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String Raza, Constitución, Sexo, Clase, Objeto,ModificarFin;

		//CREACIÓN DEL PERSONAJE
		System.out.println("¿Cuál es tu nombre completo'");
		String NombreCompleto = scanner.nextLine();
		scanner.nextLine();
		
		System.out.println("¿Cuál es tu apodo? en caso de no tener indique \"no\"?");
		String Apodo = scanner.nextLine();			
		scanner.nextLine();
		
		System.out.println("ClaseHechicero");
		
		do {
		System.out.println("¿Cuál es tu raza? (Nórdico, Bretón, Argoniano, Guardia rojo, Khajiita)");
		Raza = scanner.nextLine();
		} while (!Raza.equalsIgnoreCase("Nórdico") && !Raza.equalsIgnoreCase("Bretón") && !Raza.equalsIgnoreCase("Argoniano") && !Raza.equalsIgnoreCase("Guardia rojo") && !Raza.equalsIgnoreCase("Khajita"));
		scanner.nextLine();
		
		do { 
		System.out.println("¿Cuál es tu constitución física? (Delgado, Fuerte, Obeso)");
		Constitución = scanner.nextLine();
		} while (!Constitución.equalsIgnoreCase("Delgado") && !Constitución.equalsIgnoreCase("Fuerte") && !Constitución.equalsIgnoreCase("Obeso"));
		scanner.nextLine();
		
		do {
		System.out.println("¿Cuál es tu sexo? (Hombre, Mujer)");
		Sexo = scanner.nextLine();
		} while (!Sexo.equalsIgnoreCase("Hombre") && !Sexo.equalsIgnoreCase("Mujer"));
		scanner.nextLine();
		
		do {
		System.out.println("¿A que clase social perteneces? (Caballero, Mercenario, Ladrón, Asesino, Hechicero, Clérigo, Piromántico, Marginado)");
		Clase = scanner.nextLine();
		} while (!Clase.equalsIgnoreCase("Caballero") && !Clase.equalsIgnoreCase("Mercenario") && !Clase.equalsIgnoreCase("Ladrón") && !Clase.equalsIgnoreCase("Asesino") &&
				!Clase.equalsIgnoreCase("Hechicero") && !Clase.equalsIgnoreCase("Clérigo") && !Clase.equalsIgnoreCase("Piromántico") && !Clase.equalsIgnoreCase("Marginado"));
		scanner.nextLine();
		
		do {
		System.out.println("Elige un objeto con el que empezar: (Anillo de vida, Hueso de regreso, Objeto petrificado, Semilla de gigante)");
		Objeto = scanner.nextLine();
		} while (!Objeto.equalsIgnoreCase("Anillo de vida") && !Objeto.equalsIgnoreCase("Hueso de regreso") && !Objeto.equalsIgnoreCase("Objeto petrificado") && !Objeto.equalsIgnoreCase("Semilla de gigante"));
		scanner.nextLine();
	
		//RESUMEN, MODIFICACIÓN Y/O CONFIRMACIÓN DEL PERSONAJE
		do {
		System.out.println("Este es tu personaje: \n-Nombre: "+ NombreCompleto+"\n-Apodo: "+ Apodo +"\n-Raza: "+ Raza +"\n-Constitución: "+ Constitución +"\n-Sexo: "+ Sexo +"\n-Clase: "+ Clase +
				"\n-Objeto: "+ Objeto +"");
		
		System.out.println("\"Si ya está todo listo escriba \"continuar\" Por el contrario, si necesita modificar su personaje escriba el apartado a editar (Nombre, Apodo, Raza, Sexo, "
				+ "Constitución, Clase, Objeto, Habilidades)");
		ModificarFin = scanner.nextLine();
		if (ModificarFin.equalsIgnoreCase("continuar")){
			System.out.println("Bienvenido, Albion online es un mmorpg no lineal, en el que escribes tu propia historia sin limitarte a seguir un camino prefijado");
		} else if (ModificarFin.equalsIgnoreCase("Nombre")) {
			System.out.println("Cuál es tu nombre completo");
			NombreCompleto = scanner.nextLine();
			scanner.nextLine();
		} else if (ModificarFin.equalsIgnoreCase("Apodo")) {
			System.out.println("¿Cuál es tu apodo? en caso de no tener indique \"no\"");
			Apodo = scanner.nextLine();
			scanner.nextLine();
		} else if (ModificarFin.equalsIgnoreCase("Raza")) {
			System.out.println("¿Cuál es tu raza? (Nórdico, Bretón, Argoniano, Guardia rojo, Khajiita)");
			Raza = scanner.nextLine();
			scanner.nextLine();
		} else if (ModificarFin.equalsIgnoreCase("Constitución")) {
			System.out.println("¿Cuál es tu constitución física? (Delgado, Fuerte, Obeso)");
			Constitución = scanner.nextLine();
			scanner.nextLine();
		} else if (ModificarFin.equalsIgnoreCase("Sexo")) {
			System.out.println("¿Cuál es tu sexo? (Hombre, Mujer)");
			Sexo = scanner.nextLine();
			scanner.nextLine();
		} else if (ModificarFin.equalsIgnoreCase("Clase")) {
			System.out.println("¿A que clase social perteneces? (Caballero, Mercenario, Ladrón, Asesino, Hechicero, Clérigo, Piromántico, Marginado)");
			Clase = scanner.nextLine();
			scanner.nextLine();
		} else if (ModificarFin.equalsIgnoreCase("Objeto")) {
			System.out.println("Elige un objeto con el que empezar: (Anillo de vida, Hueso de regreso, Objeto petrificado, Semilla de gigante)");
			Objeto = scanner.nextLine();
			scanner.nextLine();
		} else {
			System.out.println("Opción no válida, por favor, introduzca una de las opciones indicadas:");
		}
		} while (!ModificarFin.equalsIgnoreCase ("Continuar"));

		scanner.close();
	}
}
