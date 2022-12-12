package Hospital;

public class CriterioEdadMenor extends Criterio{
	
	private int unaEdad;
	
	public CriterioEdadMenor(int unaEdad) {
		this.unaEdad= unaEdad;
	}
	
	public boolean cumple(Paciente p) {
		return (p.getEdad()<unaEdad);
	}

}
