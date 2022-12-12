package parcial20;

import java.util.ArrayList;

public abstract class ElementoHospital {
	
	public abstract ArrayList<ElementoHospital>camasDisponibles();
	public abstract int totalCamas();
	public abstract ArrayList<ElementoHospital>copia(Criterio c);
	

}
