package dominio.unlam;

public class Estudiantes {
//	• De los estudiantes interesa saber DNI, apellido y nombre.
//	• Los estudiantes podrán solicitar el préstamo de hasta 2 libros simultáneamente.
	
	int cantidadLibros = 0; 
	int DNI;
	String apellido;
	String nombre; 
	
	Libro [] librosPrestados = new Libro[2];  
	
	public boolean maxLibros() {
		return this.cantidadLibros<2; 
	}
	
	public void prestar(Libro libro) {
		this.librosPrestados[this.cantidadLibros] = libro;
	}
	
	//cantidadDeLibrosPrestados;
}
