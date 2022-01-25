
public class Alumno {
	// ----- Atributos
	String nombre;
	
	// Innecesario el uso de matriz -> sólo como ejercicio.
	private float[][] notas = {{1,0},{2,0},{3,0}};
	// -----
	
	// Constructor
	public Alumno(String nombre) {
		this.nombre = nombre;
	}
	
	// Setter & getters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// ----- Método sobrecargado 'Nota'
	public void Nota(int nNota, float nota) {
		// nNota es 1, 2 o 3 para permitir un llamado "natural".
		notas[nNota-1][1] = nota;
	}
	
	public float Nota(int nNota) {
		return notas[nNota-1][1];
	}
	// --------
}
