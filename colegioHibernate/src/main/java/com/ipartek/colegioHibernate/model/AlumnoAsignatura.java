package com.ipartek.colegioHibernate.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.ipartek.colegioHibernate.model.pks.AlumnosAsignaturasPK;

@Entity
@Table(name="alumnos_asignaturas")
public class AlumnoAsignatura {
	
	@EmbeddedId
	private AlumnosAsignaturasPK pk;
	
	@Column
	private Double nota;

	public AlumnosAsignaturasPK getPk() {
		return pk;
	}

	public void setPk(AlumnosAsignaturasPK pk) {
		this.pk = pk;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

}
