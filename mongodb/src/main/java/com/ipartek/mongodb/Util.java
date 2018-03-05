package com.ipartek.mongodb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class Util {
	
	public static List<Pais> cargarPaises() {
		Reader readerPaises;
		try {
			readerPaises = Files.newBufferedReader(Paths.get("/Users/mum/datos/country-list.csv"));
	        CsvToBean<Pais> csvReaderPaises = new CsvToBeanBuilder<Pais>(readerPaises)
	                .withType(Pais.class)
	                .withIgnoreLeadingWhiteSpace(true)
	                .withSkipLines(1)
	                .build();

	        return csvReaderPaises.parse();	
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}	
	}
	
	public static List<Ciudad> cargarCiudades() {
		BufferedReader readerCiudades;
		try {
			readerCiudades = Files.newBufferedReader(Paths.get("/Users/mum/datos/world-cities.csv"));
	        CsvToBean<Ciudad> csvReaderCiudades = new CsvToBeanBuilder<Ciudad>(readerCiudades)
	                .withType(Ciudad.class)
	                .withIgnoreLeadingWhiteSpace(true)
	                .withSkipLines(1)
	                .build();

	         return csvReaderCiudades.parse();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}	
	}
	
	public static List<Populacion> cargarPopulacion() {
		Reader readerPopulation;
		try {
			readerPopulation = Files.newBufferedReader(Paths.get("/Users/mum/datos/unsd-citypopulation-year-both.csv"));
            CsvToBean<Populacion> csvReaderPopulacion = new CsvToBeanBuilder<Populacion>(readerPopulation)
                    .withType(Populacion.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .withSkipLines(1)
                    .build();

             return csvReaderPopulacion.parse();

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}		
	}
	
	public static String eliminarCaracteresEspeciales(String s) {
		s = s.replaceAll("Å", "A");
		s = s.replaceAll("À", "A");
		s = s.replaceAll("Á", "A");
		s = s.replaceAll("Ä", "A");
		
		return s;
	}

}
