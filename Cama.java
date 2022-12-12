package Hospital;

import java.util.ArrayList;

public class Cama extends ElementoHospital{
	private Paciente paciente;
	private ArrayList<String>equipamientos;
	private Criterio criterio;
	
	
	public Cama(Paciente paciente, Criterio criterio) {
		this.paciente= paciente;
		this.criterio= criterio;
		this.equipamientos= new ArrayList<>();
	}
	
	public void asignarPaciente(Paciente p){
				
		if(this.paciente==null&& criterio.cumple(p)) {
			this.paciente= p;
		}
	}
	
	public ArrayList<ElementoHospital>camasDisponibles(){
		
		ArrayList<ElementoHospital>resultado= new ArrayList<>();
		
		if(this.paciente==null) {
			resultado.add(this);
		}
		return resultado;
	}
	
	public int totalCamas() {
		return 1;
	}
	
	public ArrayList<ElementoHospital>copia(Criterio c){
		
		ArrayList<ElementoHospital>resultado= new ArrayList<>();
		
		if(this.paciente!=null && c.cumple(this.paciente)) {
			Cama a= new Cama(this.paciente, this.criterio);
			resultado.add(a);
		}
		return resultado;
	}
	
	public void addEquipamiento(String e) {
		this.equipamientos.add(e);
	}


	public Paciente getPaciente() {
		return paciente;
	}


	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	public ArrayList<String>getEquipamientos(){
		return new ArrayList<String>(this.equipamientos);
	}

	public void setCriterio(Criterio criterio) {
		this.criterio = criterio;
	}

	@Override
	public String toString() {
		return "Cama [paciente=" + paciente + ", equipamientos=" + equipamientos + "]";
	}
	
}
