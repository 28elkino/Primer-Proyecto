
public class Combate extends Avion {
	
	// ATRIBUTOS
	public boolean esFurtivo;
	
	// CONSTRUCTOR
	public Combate (int idAvion, String modAvion, int CapAvion, Piloto pilotoAsignado, boolean esFurtivo) {
		super(idAvion, modAvion, CapAvion, pilotoAsignado);
		this.esFurtivo = esFurtivo;
	} 
	
	// MÉTODOS
	public void mostrarInfoCombate() {
		mostrarAvion();
        System.out.println("ES FURTIVO: " + esFurtivo);
	}
	
	public boolean getesFurtivo() {
        return esFurtivo;
    }
    public void setesFurtivo(boolean esFurtivo) {
        this.esFurtivo = esFurtivo;
    }
	
}