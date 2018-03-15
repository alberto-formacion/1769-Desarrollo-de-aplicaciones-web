package com.ipartek.spring.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ipartek.spring.rest.model.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {

}
