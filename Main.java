package Hospital;

public class Main {

	public static void main(String[] args) {
		
		Criterio edadMenor= new CriterioEdadMenor(36);
		Criterio edadMayor= new CriterioEdadMayor(50);
		Criterio sintoma= new CriterioSintoma("Tos");
		Criterio requerimiento= new CriterioRequerimiento("Respirador artificial");
		
		Paciente Molina= new Paciente("Matias Molina",30);
		Molina.addSintoma("Dolor muscular");
		Molina.addEquipNecesario("Masajeador");
		
		Paciente Ayala= new Paciente("Gonzalo Ayala",31);
		Ayala.addSintoma("Dificultad para respirar");
		Ayala.addEquipNecesario("Respirador artificial");
		
		Paciente Escobar= new Paciente("Celeste Escobar",25);
		Escobar.addSintoma("Tos");
		Escobar.addEquipNecesario("Nebulizador");
		
		Paciente Messi= new Paciente("Lionel Messi",35);
		Messi.addSintoma("Molestia en tobillo");
		Messi.addEquipNecesario("Tomografo");
		
		Paciente Scaloni= new Paciente("Lionel Scaloni",44);
		Scaloni.addSintoma("Dolor de cabeza");
		Scaloni.addEquipNecesario("Tomografo");
		
		Paciente Perez= new Paciente("Juan Perez",80);
		Perez.addSintoma("Neumonia");
		Perez.addEquipNecesario("Respirador artificial");
		
		Paciente Foulkes= new Paciente("Leandro Foulkes",29);
		Foulkes.addSintoma("Acidez");
		Foulkes.addEquipNecesario("Endoscopio");
		
		Sala general= new Sala();
		Cama camaGeneral1= new Cama(null,edadMenor);
		camaGeneral1.addEquipamiento("Nebulizador");
		Cama camaGeneral2= new Cama(null,edadMayor);
		camaGeneral2.addEquipamiento("Nebulizador");

		Sala terapia= new Sala();
		Sala terapiaIntensiva= new Sala();
		Cama camaTerapiaIntensiva1= new Cama(null,requerimiento);
		camaTerapiaIntensiva1.addEquipamiento("Respirador artificial");
		camaTerapiaIntensiva1.addEquipamiento("Tomografo");
		Cama camaTerapiaIntensiva2= new Cama(null,sintoma);
		camaTerapiaIntensiva2.addEquipamiento("Respirador artificial");
		Cama camaTerapiaIntensiva3= new Cama(null,edadMenor);
		camaTerapiaIntensiva3.addEquipamiento("Tomografo");
		
		Sala terapiaIntermedia= new Sala();
		Cama camaTerapiaIntermedia1= new Cama(null,sintoma);
		camaTerapiaIntermedia1.addEquipamiento("Respirador artificial");
		Cama camaTerapiaIntermedia2= new Cama(null,requerimiento);
		camaTerapiaIntermedia2.addEquipamiento("Endoscopio");
		
		general.addElemento(camaGeneral1);
		general.addElemento(camaGeneral2);
		
		terapiaIntensiva.addElemento(camaTerapiaIntensiva1);
		terapiaIntensiva.addElemento(camaTerapiaIntensiva2);
		terapiaIntensiva.addElemento(camaTerapiaIntensiva3);
		
		terapiaIntermedia.addElemento(camaTerapiaIntermedia1);
		terapiaIntermedia.addElemento(camaTerapiaIntermedia2);
		
		terapia.addElemento(terapiaIntermedia);
		terapia.addElemento(terapiaIntensiva);
		
		general.addElemento(terapia);
		
		System.out.println(general.totalCamas());
		System.out.println(general.camasDisponibles());
		
		camaGeneral1.asignarPaciente(Escobar);
		System.out.println(camaGeneral1);
		
		System.out.println(general.camasDisponibles());
		
		System.out.println(general.copia(edadMenor));
	}
}
