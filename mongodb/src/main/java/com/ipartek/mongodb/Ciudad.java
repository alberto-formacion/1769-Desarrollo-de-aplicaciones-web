package com.ipartek.mongodb;

import com.opencsv.bean.CsvBindByPosition;

public class Ciudad {
	
	@CsvBindByPosition(position = 1)
	private String pais;
	
	@CsvBindByPosition(position = 0)
	private String nombre;
	
	public Ciudad() {
		// TODO Auto-generated constructor stub
	}

	public Ciudad(String pais, String nombre) {
		this.pais = pais;
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
