
public class Piloto {
	
	// ATRIBUTOS
	public int idPiloto;
	public String nomPiloto;
	public int horasVueloPiloto;
	public String rangoPiloto;
	
	// CONSTRUCTOR
	public Piloto(int idPiloto, String nomPiloto, int horasVueloPiloto, String rangoPiloto) {
	this.idPiloto = idPiloto;
	this.nomPiloto = nomPiloto;
	this.horasVueloPiloto = horasVueloPiloto;
	this.rangoPiloto = rangoPiloto;
	}
	
	// MÉTODOS
	public void mostrarPiloto() {
		System.out.println("ID: " + idPiloto);
	    System.out.println("NOMBRE: " + nomPiloto);
	    System.out.println("HORAS DE VUELO: " + horasVueloPiloto);
	    System.out.println("RANGO PILOTO: " + rangoPiloto);
	}
	
    public int getidPiloto() {
        return idPiloto;
    }
    public void setidPiloto(int idPiloto) {
        this.idPiloto = idPiloto;
    }
	
    public String getnomPiloto() {
        return nomPiloto;
    }
    public void setnomPiloto(String nomPiloto) {
        this.nomPiloto = nomPiloto;
    }
    
    public int gethorasVueloPiloto() {
        return horasVueloPiloto;
    }
    public void sethorasVueloPiloto(int horasVueloPiloto) {
        this.horasVueloPiloto = horasVueloPiloto;
    }
	
    public String getrangoPiloto() {
        return rangoPiloto;
    }
    public void setrangoPiloto(String rangoPiloto) {
        this.rangoPiloto = rangoPiloto;
    }

}
