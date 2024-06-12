import java.util.Scanner;

public class TopGun {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// CREAR 3 OBJETOS DE TIPO PILOTO
		Piloto piloto1 = new Piloto(1234, "Pete Maverick", 230, "Capitán");
		Piloto piloto2 = new Piloto(9876, "Natasha Phoenix", 96, "Primer oficial");
		Piloto piloto3 = new Piloto(0456, "Bradley Rooster", 96, "Segundo oficial");

		// CREAR 2 OBJETOS DE TIPO PILOTO MEDIANTE CONSOLA
		System.out.println("Introduce los datos para el cuarto piloto:");
		    System.out.print("ID: ");
		    int id4 = scanner.nextInt();
		    scanner.nextLine();
		    
		    System.out.print("Nombre: ");
		    String nombre4 = scanner.nextLine();

		    System.out.print("Horas de vuelo: ");
		    int horasVuelo4 = scanner.nextInt();
		    scanner.nextLine();
		    
		    System.out.print("Rango: ");
		    String rango4 = scanner.nextLine();
		    scanner.nextLine();
		    
		    System.out.println("Introduce los datos para el quinto piloto:");
		    System.out.print("ID: ");
		    int id5 = scanner.nextInt();
		    scanner.nextLine();
		    
		    System.out.print("Nombre: ");
		    String nombre5 = scanner.nextLine();
		    
		    System.out.print("Horas de vuelo: ");
		    int horasVuelo5 = scanner.nextInt();
		    scanner.nextLine();

		    System.out.print("Rango: ");
		    String rango5 = scanner.nextLine();
		    scanner.nextLine();
		    
		    Piloto piloto4 = new Piloto(id4, nombre4, horasVuelo4, rango4);
	        Piloto piloto5 = new Piloto(id5, nombre5, horasVuelo5, rango5);
	        
	     // MOSTRAR INFORMACIÓN PILOTOS MAVERICK Y ROOSTER
	        piloto1.mostrarPiloto();
	        piloto3.mostrarPiloto();
	        
	     // MOSTRAR INFORMACIÓN DE TODOS LOS PILOTOS AÑADIDOS POR EL USUARIO
	        piloto4.mostrarPiloto();
	        piloto5.mostrarPiloto();
	        
	     // CREAR 3 OBJETOS DE TIPO AVION
	        Avion avion1 = new Combate(124, "F-22 Raptor", 1, piloto5, false);
	        Avion avion2 = new Combate(1, "F-24 Hydra", 1, piloto1, false);
	        Avion avion3 = new Entrenamiento(1, "F-30", 2, piloto3, true);
	        
	     // CREAR 2 OBJETOS DE TIPO AVION MEDIANTE CONSOLA
	        System.out.println("Introduce los datos para el cuarto avion:");
		    System.out.print("ID: ");
		    int idAvion4 = scanner.nextInt();
		    scanner.nextLine();	
		    
		    System.out.print("Modelo: ");
		    String modAvion4 = scanner.nextLine();

		    System.out.print("Plazas: ");
		    int CapAvion4 = scanner.nextInt();
		    scanner.nextLine();
		    
		    System.out.print("El avion tiene doble mando? (True/False): ");
		    Boolean tieneDobleMando4 = scanner.nextBoolean();
		    
		    System.out.println("Introduce los datos para el quinto avion:");
			System.out.print("ID: ");
			int idAvion5 = scanner.nextInt();
			scanner.nextLine();	
			    
			System.out.print("Modelo: ");
			String modAvion5 = scanner.nextLine();

		    System.out.print("Plazas: ");
		    int CapAvion5 = scanner.nextInt();
		    scanner.nextLine();
			    
		    System.out.print("El avion tiene doble mando? (True/False): ");
		    Boolean tieneDobleMando5 = scanner.nextBoolean();

		    
		    Avion avion4 = new Entrenamiento(idAvion4, modAvion4, CapAvion4, piloto4, tieneDobleMando4);
		    Avion avion5 = new Entrenamiento(idAvion5, modAvion5, CapAvion5, piloto2, tieneDobleMando5);

		 // MOSTRAR TODA LA INFORMACIÓN DE LOS AVIONES
		    avion1.mostrarAvion();
		    avion2.mostrarAvion();
		    avion3.mostrarAvion();
		    avion4.mostrarAvion();
		    avion5.mostrarAvion();
		    
	        scanner.close(); 
	}
}
