package Hospital;

public class CriterioSintoma extends Criterio{
	
	private String unSintoma;
	
	public CriterioSintoma(String unSintoma) {
		this.unSintoma= unSintoma;
	}
	
	public boolean cumple(Paciente p) {
		return (p.getSintomas().contains(unSintoma));
	}

}
