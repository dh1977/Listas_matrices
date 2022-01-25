import java.util.ArrayList;

public class ppal {
	// Permite crear alumnos, asignarles nombre y hasta notas.
	
	public static void main(String[] args) {
		Alumno alum1 = new Alumno ("Juan");
		Alumno alum2 = new Alumno ("Pepe");
		Alumno alum3 = new Alumno ("Mary");
		
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		
		alumnos.add(alum1);
		alumnos.add(alum2);
		alumnos.add(alum3);
		
		alum1.Nota(1, 5.4f);
//		alum1.Nota(2, 6.1f);
		alum1.Nota(3, 4.9f);
		
		alum2.Nota(1, 3.4f);
		alum2.Nota(2, 6.5f);
		alum2.Nota(3, 4.6f);

		alum3.Nota(1, 6.4f);
		alum3.Nota(2, 5.1f);
		alum3.Nota(3, 6.9f);

		float prom;
		int n;
		
		// Recorro la lista de alumnos
		for (Alumno a: alumnos) 
		{	System.out.println("Alumno: " + a.nombre);
		
			// Muestro las notas y promedio (si aplica) del alumno actual.
			System.out.print("Notas: ");
			n = 0;
			prom = 0f;
			for (int i=1; i <= 3; i++) 
			{	if (a.Nota(i) > 0) 
				{	System.out.print(a.Nota(i)+"  ");
					prom += a.Nota(i);
					n++;
				}
				else
					System.out.print("Nota "+i+" no asignada  ");
			} // -> ciclo de notas
			
			System.out.println("");
			
			if (n==3)
				System.out.println("Promedio: " + (prom/n));
			else
				System.out.println("Promedio: no disponible");
			
			System.out.println("------------------------------");
		} // -> for de alumnos
	}

}
