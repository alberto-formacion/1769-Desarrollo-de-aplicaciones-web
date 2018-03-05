package com.ipartek.mongodb;

import java.util.List;

public class CiudadPopulacion {
	
	private String nombre;
	private List<Populacion> populacion;
	
	public List<Populacion> getPopulacion() {
		return populacion;
	}
	public void setPopulacion(List<Populacion> populacion) {
		this.populacion = populacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
