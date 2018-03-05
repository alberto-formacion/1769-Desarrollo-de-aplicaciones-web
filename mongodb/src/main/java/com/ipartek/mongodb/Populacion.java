package com.ipartek.mongodb;

import com.opencsv.bean.CsvBindByPosition;

public class Populacion {
	
	@CsvBindByPosition(position = 4)
	private String ciudad;
	
	@CsvBindByPosition(position = 1)
	private String anyo;
	
	@CsvBindByPosition(position = 9)
	private String populacion;
	
	public Populacion() {
		// TODO Auto-generated constructor stub
	}

	public Populacion(String ciudad, String populacion, String anyo) {
		this.ciudad = ciudad;
		this.anyo = anyo;
		this.populacion = populacion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getPopulacion() {
		return populacion;
	}

	public void setPopulacion(String populacion) {
		this.populacion = populacion;
	}

	public String getAnyo() {
		return anyo;
	}

	public void setAnyo(String anyo) {
		this.anyo = anyo;
	}

}
