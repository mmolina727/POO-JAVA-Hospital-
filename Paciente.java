package parcial20;

import java.util.ArrayList;

public class Paciente {
	
	private String nombre;
	private int edad;
	private ArrayList<String>sintomas;
	private ArrayList<String>equipNecesario;
	
	public Paciente(String nombre, int edad) {
		this.nombre= nombre;
		this.edad= edad;
		this.sintomas= new ArrayList<>();
		this.equipNecesario= new ArrayList<>();
	}
	
	public void addSintoma(String s) {
		this.sintomas.add(s);
	}
	
	public void addEquipNecesario(String e) {
		this.equipNecesario.add(e);
	}
	
	public ArrayList<String>getSintomas(){
		return new ArrayList<String>(this.sintomas);
	}
	
	public ArrayList<String>getEquipNecesario(){
		return new ArrayList<String>(this.equipNecesario);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Paciente [nombre=" + nombre + ", edad=" + edad + ", sintomas=" + sintomas + ", equipNecesario="
				+ equipNecesario + "]";
	}

}
