package com.ipartek.mongodb;

import java.util.List;

public class PaisCiudadPopulacion {
	
	private String nombre;
	private List<CiudadPopulacion> ciudades;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<CiudadPopulacion> getCiudades() {
		return ciudades;
	}
	public void setCiudades(List<CiudadPopulacion> ciudades) {
		this.ciudades = ciudades;
	}

}
