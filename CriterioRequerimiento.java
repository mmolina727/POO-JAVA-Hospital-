package parcial20;

public class CriterioRequerimiento extends Criterio{
	
	private String unRequerimiento;
	
	public CriterioRequerimiento(String unRequerimiento) {
		this.unRequerimiento= unRequerimiento;
	}
	
	public boolean cumple(Paciente p) {
		return(p.getEquipNecesario().contains(unRequerimiento));
	}

}
