package parcial20;

public class CriterioEdadMayor extends Criterio{
	
	private int unaEdad;
	
	public CriterioEdadMayor(int unaEdad) {
		this.unaEdad= unaEdad;
	}
	
	public boolean cumple(Paciente p) {
		return(p.getEdad()>unaEdad);
	}

}
