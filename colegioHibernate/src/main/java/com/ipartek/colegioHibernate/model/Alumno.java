package com.ipartek.colegioHibernate.model;

import java.util.List;

import javax.persistence.Column;
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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idAlumno")
	private Integer id;
	
	@Column
	private String nombre;
	
	@Column
	private String apellidos;
	
	@OneToMany
	@JoinColumn(name="alumnos_idalumno")
	private List<AlumnoAsignatura> notas;

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

	public List<AlumnoAsignatura> getNotas() {
		return notas;
	}

	public void setNotas(List<AlumnoAsignatura> notas) {
		this.notas = notas;
	}

}
