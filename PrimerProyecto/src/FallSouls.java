
public class FallSouls {
	public static void main(String[] args) {
	
	// CREAR CLASES
	Clase Caballero = new Clase (12,11,13,12,9,12,11);
	Clase Mercenario = new Clase (16,13,12,11,10,7,11);
	Clase Guerrero = new Clase (12,12,16,9,8,12,11);
	Clase Asesino = new Clase (10,13,9,16,11,13,8);
	Clase Hechicero = new Clase (14,11,9,10,16,10,10);
	Clase Heraldo = new Clase (12,12,10,10,12,16,8);
	Clase Ladrón = new Clase (10,12,8,11,11,12,16);
	Clase Marginado = new Clase (10,10,10,10,10,10,10);
	
	System.out.println("Caballero:");
    Caballero.mostrarInformacion();		
    
    System.out.println("---------------------");
    
    System.out.println("Mercenario:");
    Mercenario.mostrarInformacion();	
    
    System.out.println("---------------------");
    
    System.out.println("Guerrero:");
    Guerrero.mostrarInformacion();	
    
	System.out.println("---------------------");
	
	System.out.println("Asesino:");
	Asesino.mostrarInformacion();	
	
    System.out.println("---------------------");
    
    System.out.println("Hechicero:");
    Hechicero.mostrarInformacion();	
    
    System.out.println("---------------------");
    
    System.out.println("Heraldo:");
    Heraldo.mostrarInformacion();	
    
    System.out.println("---------------------");
    
    System.out.println("Ladrón:");
    Ladrón.mostrarInformacion();	
    
    System.out.println("---------------------");
    
    System.out.println("Marginado:");
    Marginado.mostrarInformacion();	
    
	}
}