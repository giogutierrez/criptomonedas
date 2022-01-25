package com.giovanny.clientemutante.util;

public class MatrizUtil {

	public static char[][] armaMatriz(String[] dna) {

		char[][] dnaMatriz = new char[dna.length][dna.length];
		int longitudBase = dna[0].length();
		int i = 0;

		for (String dnaIndividual : dna) {
			validaDatos(dnaIndividual, dna.length, longitudBase);
			dnaMatriz[i] = dnaIndividual.toUpperCase().toCharArray();
			i++;
		}
		
		
		
		
        for (i = 0; i < dna.length; i++) {
            for (int j = 0; j < dna[i].length(); j++) {
                System.out.print(dnaMatriz[i][j]);
            }
            System.out.print("\n");
        }
		
		
		return dnaMatriz;
	}

	private static void validaDatos(String dnaIndividual, int longitudMatriz, int longitudBase) {

		if (longitudMatriz != dnaIndividual.length()) {
			throw new ApplicationException(Constantes.ERROR_LONGITUD_INDIVUAL + longitudMatriz + " " + dnaIndividual);
		}

		if (!dnaIndividual.matches(".*[ATCG].*")) {
			throw new ApplicationException(Constantes.ERROR_CARACTERES);
		}

	}

}
