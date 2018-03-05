package com.ipartek.mongodb;

import com.opencsv.bean.CsvBindByPosition;

public class Pais {
	
	@CsvBindByPosition(position = 0)
	private String nombre;
	
	@CsvBindByPosition(position = 1)
	private String codigo;
	
	public Pais() {
	}
	
	public Pais(String nombre, String codigo) {
		this.codigo = codigo;
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
}
