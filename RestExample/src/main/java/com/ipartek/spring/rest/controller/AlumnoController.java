package com.ipartek.spring.rest.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ipartek.spring.rest.model.Alumno;
import com.ipartek.spring.rest.repository.AlumnoRepository;

@RestController
@RequestMapping("/api/alumnos")
public class AlumnoController {
	
	 @Autowired
	 private AlumnoRepository repository;
	
	 @RequestMapping(method = GET)
	 public List<Alumno> getAlumnos() {
	 	return repository.findAll();
	 }
	 
	 @RequestMapping(method = GET, value = "/{id}")
	 public ResponseEntity<Alumno> getAlumnoById(@PathVariable int id) {
		 Optional<Alumno> alumno = repository.findById(id);
		 try {
		    return new ResponseEntity<Alumno>(alumno.get(), HttpStatus.OK);
		 } catch (Exception ex) {
			 return new ResponseEntity<Alumno>(HttpStatus.NOT_FOUND);
		 }
	 }
	 
	 @RequestMapping(method = {POST, PUT})
	 public ResponseEntity<Alumno> addUpdateCustomer(@Valid @RequestBody Alumno alumno) {
		 repository.save(alumno);
		 return new ResponseEntity<Alumno>(alumno, HttpStatus.OK);
	 }

}
