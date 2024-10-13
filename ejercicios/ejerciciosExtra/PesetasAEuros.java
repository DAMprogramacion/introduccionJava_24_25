/*
 * Programa que convierte de pesetas a euros
 */


public class PesetasAEuros{
	
	public static void main (String[] args) {
		
		final double PESETAS_A_EUROS = 0.0013;
		double pesetas = 600;
		double euros   = PESETAS_A_EUROS * pesetas;
		
		System.out.println(pesetas + " ptas son " + euros + " €");
	}
}

