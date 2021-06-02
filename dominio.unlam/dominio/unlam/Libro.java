package dominio.unlam;

public class Libro {
	// • Los libros pueden ser prestados a cualquier estudiante.
//	• De los libros interesa registrar código, nombre y autor.
	
	
	String eNombre;
	String eApellido;
	int eDNI; 
	int codigo;
	String nombre;
	String autor;
	boolean prestado; 
	String contenido;
	
	public boolean prestar  (String eNombre, String eApellido, int eDNI) {
	 if (prestado) {
		 return false; 
	 }
	 
	  prestado = true; 
	  this.eNombre = eNombre;
	  this.eApellido = eApellido;
	  this.eDNI = eDNI;
	  return true; 
	}
	
	 
}
