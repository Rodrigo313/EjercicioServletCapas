/**
 * 
 */
package com.rodri.app.datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author rodri
 *
 */
public class ConsultaDatos {
	
	public ArrayList<String> consultaCoches(String nombre) throws IOException {
		File f = new File("C:\\Users\\201909\\Documents//Coches.txt");
		BufferedReader br;
		ArrayList<String> listaNombres = new ArrayList<>();
		
		br = new BufferedReader(new FileReader(f));
		String linea;
		while((linea = br.readLine()) != null){
			String [] arrayPersona = linea.split("-");
			listaNombres.add(arrayPersona[0]);
		}
		
		return listaNombres;
	}
}
