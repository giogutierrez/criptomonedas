package com.giovanny.clientemutante.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IdentificaMutanteUtil {
	
	private IdentificaMutanteUtil(){
	}

	private static Long cantidadSecuencia = 0L;
	

	public static boolean isMutant(String[] dna, char[][] dnaMatriz) {
		
		cantidadSecuencia = 0L;

		addHorizontal(dna);
		addVertical(dnaMatriz);
		addDiagonalUno(dnaMatriz);
		addDiagonalDos(dnaMatriz);

		if (cantidadSecuencia >= 2) {
			return true;
		}
		return false;
	}

	
	public static void addHorizontal(String[] dna){
		List<String> result = new ArrayList<>();
		  result.addAll(Arrays.asList(dna));
		  
		  List<String> dnaSecuencia = Arrays.asList("AAAA","TTTT", "CCCC", "GGGG");
		
		  cantidadSecuencia = result.stream().filter(a->
		  dnaSecuencia.stream().filter(w->a.contains(w)).count() > 0)
		 .count();
	}
	
	
	public static void addVertical(char[][] dnaMatriz) {
		
		if (cantidadSecuencia >= Constantes.SIZE_MUTANTE) {
			return;
		}

		StringBuilder datoIndividual = new StringBuilder();

		for (int fil = 0; fil < dnaMatriz.length; fil++) {
			for (int col = 0; col < dnaMatriz[fil].length; col++) {
				
				datoIndividual.append(dnaMatriz[col][fil]);
				
				if (datoIndividual.length() >= Constantes.SIZE_ADN && validaCadena(datoIndividual.toString()).equals(Constantes.OK)) {
						if (cantidadSecuencia >= Constantes.SIZE_MUTANTE) {
							return;
						}
						break;
				}
			}
			datoIndividual = new StringBuilder();
		}
	}

	public static void addDiagonalUno(char[][] dnaMatriz) {
		
		if (cantidadSecuencia >= Constantes.SIZE_MUTANTE) {
			return;
		}

		int altura = dnaMatriz.length; 
		int anchura = dnaMatriz[0].length;

		StringBuilder datoIndividual = new StringBuilder();

		for (int diagonal = 1 - anchura;diagonal <= altura - 1;diagonal += 1) 
		{
			for (Integer vertical = Math.max(0, diagonal), horizontal = -Math.min(0, diagonal);
	                vertical < altura && horizontal < anchura; 
	                vertical += 1, horizontal += 1
	            ) {
				datoIndividual.append(dnaMatriz[vertical][horizontal]);

				if (datoIndividual.length() >= Constantes.SIZE_ADN && validaCadena(datoIndividual.toString()).equals(Constantes.OK)) {
						if (cantidadSecuencia >= Constantes.SIZE_MUTANTE) {
							return;
						}
						break;
				}
			}
			datoIndividual = new StringBuilder();
		}
	}


	
	/**
	 * Metodo para recorrer diagonal
	 * 
	 * @param char[][]
	 */
	public static void addDiagonalDos(char[][] dnaMatriz) {

		if (cantidadSecuencia >= Constantes.SIZE_MUTANTE) {
			return;
		}

		int n = dnaMatriz.length;
		int	m = dnaMatriz[0].length; 
		int	cantDiagonales = n + m - 1;

		StringBuilder datoIndividual = new StringBuilder();

		for (int diagonal = 0; diagonal < cantDiagonales; diagonal++) {
			for (int x, y = Math.min(diagonal, m - 1); y >= 0 && (x = diagonal - y) < n; y--) {
				
				datoIndividual.append(dnaMatriz[y][x]);

				if (datoIndividual.length() >= Constantes.SIZE_ADN && validaCadena(datoIndividual.toString()).equals(Constantes.OK)) {
						if (cantidadSecuencia >= Constantes.SIZE_MUTANTE) {
							return;
						}
						break;
				}
			}
			datoIndividual = new StringBuilder();
		}
	}

	
	
	/**
	 * Metodo para validar secuencia
	 * 
	 * @param String
	 */	
	public static String validaCadena(String cadena) {

		String isSecuencia = Constantes.NO;

		if (cadena.matches(".*AAAA.*") || cadena.matches(".*TTTT.*") || cadena.matches(".*CCCC.*")
				|| cadena.matches(".*GGGG.*")) {
			cantidadSecuencia = cantidadSecuencia + 1;
			isSecuencia = Constantes.OK;
		}
		return isSecuencia;
	}
}
