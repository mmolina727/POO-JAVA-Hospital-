package parcial20;

public class CriterioNot extends Criterio{
	
	private Criterio c;
	
	public CriterioNot(Criterio c) {
		this.c= c;
	}
	
	public boolean cumple(Paciente p) {
		return(!c.cumple(p));
	}

}
