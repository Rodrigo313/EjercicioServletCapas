/**
 * 
 */
package com.rodri.app.negocio;

import java.io.IOException;
import java.util.ArrayList;

import com.rodri.app.datos.ConsultaDatos;



/**
 * @author rodri
 *
 */
public class Negocio {
	
	public Integer numeroCoches(String nombre) throws IOException {
		int numCoches = 0;
		ConsultaDatos cd = new ConsultaDatos();
		ArrayList <String> listaNombres = new ArrayList<String>(cd.consultaCoches(nombre));
		for(int i = 0; i < listaNombres.size();i++) {
			if(listaNombres.get(i).equals(nombre)) {
				numCoches++;
			}
		}
		return numCoches;	
	}
}
