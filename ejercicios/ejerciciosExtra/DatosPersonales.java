
public class DatosPersonales {
	
	public static void main (String[] args) {
		
		String nombre    = "Ángela García Peña";
		String direccion = "Avda. Madrid 12, 5ºF, 23007 Jaén";
		String telefono  = "953222526"; // mejor tratarlo como cadena, no hace operaciones arítmeticas (+ - * ...)
		
		System.out.println("Mi nombre es:    " + nombre);
		System.out.println("Mi dirección es: " + direccion);
		System.out.println("Mi teléfono es:  " + telefono);
		
		String salida = "\nMi nombre es:    " + nombre + '\n';
		salida += "Mi dirección es: " + direccion + '\n';
		salida += "Mi teléfono es:  " + telefono;
		
		System.out.println(salida);
	}
}

