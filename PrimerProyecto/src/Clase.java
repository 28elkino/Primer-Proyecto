
public class Clase {
	
	// ATRIBUTOS
	public int Vitalidad;
	public int Resistencia;
	public int Fuerza;
	public int Destreza;
	public int Inteligencia;
	public int Carisma;
	public int Suerte;
	
	// CONSTRUCTOR
	public Clase (int Vitalidad, int Resistencia, int Fuerza, int Destreza, int Inteligencia, int Carisma, int Suerte) {
		this.Vitalidad = Vitalidad;
		this.Resistencia = Resistencia;
		this.Fuerza = Fuerza;
		this.Destreza = Destreza;
		this.Inteligencia = Inteligencia;
		this.Carisma = Carisma;
		this.Suerte = Suerte;
	}
	
	// MÉTODO PARA OBTENER LOS VALORES DE CADA HABILIDAD
	public void mostrarInformacion() {
		 System.out.println("Vitalidad: " + Vitalidad);
	     System.out.println("Resistencia: " + Resistencia);
	     System.out.println("Fuerza: " + Fuerza);
	     System.out.println("Destreza: " + Destreza);
	     System.out.println("Inteligencia: " + Inteligencia);
	     System.out.println("Carisma: " + Carisma);
	     System.out.println("Suerte: " + Suerte);
	}
	
	
	// MÉTODOS GETTERS & SETTERS
	public int getVitalidad(){
		return Vitalidad;
	}
	public void setVitalidad(int Vitalidad) {
		this.Vitalidad = Vitalidad;
	}
	
	public int getResistencia(){
		return Resistencia;
	}
	public void setResistencia(int Resistencia) {
		this.Resistencia = Resistencia;
	}
	
	public int getFuerza(){
		return Fuerza;
	}
	public void setFuerza(int Fuerza) {
		this.Fuerza = Fuerza;
	}
	
	public int getDestreza(){
		return Destreza;
	}
	public void setDestreza(int Destreza) {
		this.Destreza = Destreza;
	}
	
	public int getInteligencia(){
		return Inteligencia;
	}
	public void setInteligencia(int Inteligencia) {
		this.Inteligencia = Inteligencia;
	}
	
	public int getCarisma(){
		return Carisma;
	}
	public void setCarisma(int Carisma) {
		this.Carisma = Carisma;
	}
	
	public int getSuerte(){
		return Suerte;
	}
	public void setSuerte(int Suerte) {
		this.Suerte = Suerte;
	}
	
}