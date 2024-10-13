

public class Factura {
	
	public static void main (String[] args) {
		
		final double IVA      = 21;
		double precioUnitario = 21.23;
		int numeroUnidades    = 8;
		
		double precioFinal = numeroUnidades * precioUnitario * IVA / 100;
		
		System.out.println(numeroUnidades + " unidades valen " + precioFinal + " con IVA incluido");

		
	}
}

