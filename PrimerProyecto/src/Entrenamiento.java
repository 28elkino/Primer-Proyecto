
public class Entrenamiento extends Avion {
	
	// ATRIBUTOS
	public boolean tieneDobleMando;
	
	// CONSTRUCTOR
	public Entrenamiento (int idAvion, String modAvion, int CapAvion, Piloto pilotoAsignado, boolean tieneDobleMando) {
		super(idAvion, modAvion, CapAvion, pilotoAsignado);
		this.tieneDobleMando = tieneDobleMando;
	} 
	
	// MÉTODOS
	public void mostrarInfoMandos() {
		mostrarAvion();
        System.out.println("TIENE DOBLE MANDO: " + tieneDobleMando);
	}
	
	public boolean gettieneDobleMando() {
        return tieneDobleMando;
    }
    public void settieneDobleMando(boolean tieneDobleMando) {
        this.tieneDobleMando = tieneDobleMando;
    }
	
}
