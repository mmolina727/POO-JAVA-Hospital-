package parcial20;

public class CriterioOr extends Criterio{
	
	private Criterio cr1;
	private Criterio cr2;
	
	public CriterioOr(Criterio cr1, Criterio cr2) {
		this.cr1= cr1;
		this.cr2= cr2;
	}
	
	public boolean cumple(Paciente p) {
		return(cr1.cumple(p)||cr2.cumple(p));
	}

}
