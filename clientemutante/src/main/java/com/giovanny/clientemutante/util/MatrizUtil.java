package com.giovanny.clientemutante.util;

public class MatrizUtil {
	
	private MatrizUtil() {}

	public static char[][] armaMatriz(String[] dna) {

		char[][] dnaMatriz = new char[dna.length][dna.length];
		int i = 0;

		for (String dnaIndividual : dna) {
			validaDatos(dnaIndividual, dna.length);
			dnaMatriz[i] = dnaIndividual.toUpperCase().toCharArray();
			i++;
		}
			
		return dnaMatriz;
	}

	private static void validaDatos(String dnaIndividual, int longitudMatriz) {

		if (longitudMatriz != dnaIndividual.length()) {
			throw new ApplicationException(Constantes.ERROR_LONGITUD_INDIVUAL + longitudMatriz + " " + dnaIndividual);
		}

		Long countCaracteres = dnaIndividual.codePoints().filter(c-> c=='A' || c=='T' || c=='C' || c=='G').count();
				
		if (countCaracteres < longitudMatriz) {
			throw new ApplicationException(Constantes.ERROR_CARACTERES);
		}

	}

}
