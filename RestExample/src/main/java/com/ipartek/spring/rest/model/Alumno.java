package com.ipartek.spring.rest.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="alumnos")
public class Alumno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nombre, apellidos;
	
	@OneToMany
	@JoinColumn(name="id_alumno")
	private List<Nota> notasAlumno;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public List<Nota> getNotasAlumno() {
		return notasAlumno;
	}

	public void setNotasAlumno(List<Nota> notasAlumno) {
		this.notasAlumno = notasAlumno;
	}

}
