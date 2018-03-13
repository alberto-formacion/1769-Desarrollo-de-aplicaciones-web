package com.ipartek.colegioHibernate;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ipartek.colegioHibernate.model.Alumno;
import com.ipartek.colegioHibernate.model.AlumnoAsignatura;
import com.ipartek.colegioHibernate.model.Asignatura;
import com.ipartek.colegioHibernate.model.Profesor;

public class App {
    public static void main( String[] args ){
		Configuration cfg = new Configuration()
				.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver")
				.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/centroEstudios")
				.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect")
				.setProperty("hibernate.connection.username", "root")
				.setProperty("hibernate.connection.password", "root")
				.setProperty("hibernate.show_sql", "true")
				.setProperty("hibernate.format_sql", "true")
				.setProperty("hibernate.current_session_context_class", "thread")
				.addAnnotatedClass(Alumno.class)
				.addAnnotatedClass(AlumnoAsignatura.class)
				.addAnnotatedClass(Profesor.class)
				.addAnnotatedClass(Asignatura.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session s = sf.getCurrentSession();
		
		s.beginTransaction();
		
		Query q = s.createQuery("from Alumno");
		
		List<Alumno> alumnos = q.getResultList();

		for(Alumno a: alumnos) {
			System.out.println(a.getNombre());
			for(AlumnoAsignatura aa : a.getNotas()) {
				System.out.print(aa.getPk().getAsignatura().getNombre() + " - ");
				System.out.print(aa.getNota() + " - ");
				System.out.println(aa.getPk().getAsignatura().getProfesor().getNombre());
			}
		}
		
		s.getTransaction().commit();
		

		
    }
}
