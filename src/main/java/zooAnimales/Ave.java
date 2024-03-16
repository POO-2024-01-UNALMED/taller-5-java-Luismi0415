package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Ave extends Animal{
	private ArrayList<Ave> listado;
	public int halcones;
	public int aguilas;
	private String colorPlumas;
	
	public Ave(int totalAnimales, String nombre, int edad, String habitat, String genero, ArrayList<Zona> zona,
			ArrayList<Ave> listado, int halcones, int aguilas, String colorPlumas) {
		super(totalAnimales, nombre, edad, habitat, genero, zona);
		this.listado = listado;
		this.halcones = halcones;
		this.aguilas = aguilas;
		this.colorPlumas = colorPlumas;
	}
	
	public Ave() {
		
	}

	public ArrayList<Ave> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Ave> listado) {
		this.listado = listado;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	
	

}
