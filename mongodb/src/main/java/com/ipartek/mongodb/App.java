package com.ipartek.mongodb;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		
		List<Pais> paises = Util.cargarPaises();
		List<Ciudad> ciudades = Util.cargarCiudades();
		List<Populacion> populaciones = Util.cargarPopulacion();
		
		List<PaisCiudadPopulacion> resultado = new ArrayList<PaisCiudadPopulacion>();
		
		for(Pais pais : paises) {
			PaisCiudadPopulacion pcp = new PaisCiudadPopulacion();
			
			pcp.setNombre(pais.getNombre());
			
			List<CiudadPopulacion> cps = new ArrayList<CiudadPopulacion>();
			
			for(Ciudad ciudad : ciudades) {
				
				if(Util.eliminarCaracteresEspeciales(pais.getNombre().toLowerCase()).indexOf(ciudad.getPais().toLowerCase())>=0) {
					CiudadPopulacion cp = new CiudadPopulacion();
					cp.setNombre(ciudad.getNombre());
					cps.add(cp);
					
					List<Populacion> ps = new ArrayList<Populacion>();
					
					for(Populacion pop : populaciones) {
						
						if(pop.getCiudad()!= null && ciudad.getNombre().toLowerCase().indexOf(pop.getCiudad().toLowerCase())>=0) {
							Populacion p = new Populacion();
							
							p.setAnyo(pop.getAnyo());
							p.setPopulacion(pop.getPopulacion());
							
							ps.add(p);
						}
						
					}
					
					cp.setPopulacion(ps);
					
					
				}
				
			}
			
			pcp.setCiudades(cps);
			
			resultado.add(pcp);
		}
		

		System.out.println("Terminado!!");

	}
}
