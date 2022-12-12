package Hospital;

import java.util.ArrayList;

public class Sala extends ElementoHospital{
	
	private ArrayList<ElementoHospital>elementos;
	
	public Sala() {
		this.elementos= new ArrayList<>();
	}
	
	public ArrayList<ElementoHospital>getElementos(){
		return new ArrayList<ElementoHospital>(this.elementos);
	}
	
	public ArrayList<ElementoHospital>camasDisponibles(){
		
		ArrayList<ElementoHospital>resultado= new ArrayList<>();
		
		for (int i = 0; i < this.elementos.size(); i++) {
			
			ElementoHospital hijo= this.elementos.get(i);
			resultado.addAll(hijo.camasDisponibles());
			
		}
		return resultado;
	}
	
	public int totalCamas() {
		int total= 0;
		
		for (int i = 0; i < this.elementos.size(); i++) {
			ElementoHospital hijo= this.elementos.get(i);
			total+= hijo.totalCamas();
		}
		return total;
	}
	
	public ArrayList<ElementoHospital>copia(Criterio c){
		ArrayList<ElementoHospital>resultado= new ArrayList<>();
		
		for (int i = 0; i < this.elementos.size(); i++) {
			ElementoHospital hijo= this.elementos.get(i);
			if(!this.elementos.isEmpty()) {
				resultado.addAll(hijo.copia(c));
			}
		}
		return resultado;
	}
	
	public void addElemento(ElementoHospital h) {
		this.elementos.add(h);
	}

	@Override
	public String toString() {
		return "Sala [elementos=" + elementos + "]";
	}
}
