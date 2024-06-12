
public class Avion {

	// ATRIBUTOS
	public int idAvion;
	public String modAvion;
	public int CapAvion;
	public Piloto pilotoAsignado;
	
	// CONSTRUCTOR
	public Avion(int idAvion, String modAvion, int CapAvion, Piloto pilotoAsignado) {
	this.idAvion = idAvion;
	this.modAvion = modAvion;
	this.CapAvion = CapAvion;
	this.pilotoAsignado = pilotoAsignado;
	}
	
	// MÉTODOS
	public void mostrarAvion() {
		System.out.println("ID: " + idAvion);
	    System.out.println("MODELO: " + modAvion);
	    System.out.println("CAPACIDAD: " + CapAvion);
	    System.out.println("PILOTO ASIGNADO: ");
	    pilotoAsignado.mostrarPiloto();
	}
	
	public int getidAvion() {
        return idAvion;
    }
    public void setidAvion(int idAvion) {
        this.idAvion = idAvion;
    }
    
	public String getmodAvion() {
        return modAvion;
    }
    public void setmodAvion(String modAvion) {
        this.modAvion = modAvion;
    }
    
	public int getCapAvion() {
        return CapAvion;
    }
    public void setCapAvion(int CapAvion) {
        this.CapAvion = CapAvion;
    }
    
	public Piloto getpilotoAsignado() {
        return pilotoAsignado;
    }
    public void setpilotoAsignado(Piloto pilotoAsignado) {
        this.pilotoAsignado = pilotoAsignado;
    }
     
}