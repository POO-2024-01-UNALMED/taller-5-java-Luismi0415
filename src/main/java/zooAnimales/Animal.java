package zooAnimales;
import gestion.*;
import java.util.ArrayList;

public class Animal {
	private int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private ArrayList<Zona> zona;
	
	
	public Animal(int totalAnimales, String nombre, int edad, String habitat, String genero, ArrayList<Zona> zona) {
		this.totalAnimales = totalAnimales;
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
	}


	public Animal() {
		
	}


	public int getTotalAnimales() {
		return totalAnimales;
	}


	public void setTotalAnimales(int totalAnimales) {
		this.totalAnimales = totalAnimales;
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


	public String getHabitat() {
		return habitat;
	}


	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public ArrayList<Zona> getZona() {
		return zona;
	}


	public void setZona(ArrayList<Zona> zona) {
		this.zona = zona;
	}
	
	
	

}
