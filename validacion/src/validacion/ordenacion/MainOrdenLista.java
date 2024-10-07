package validacion.ordenacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import validacion.equals.Alumno;

public class MainOrdenLista {
	
	public static void mostrarListaAlumnos (List<Alumno> la)
	{
		for (Alumno a : la)
		{
			System.out.println("Nombre " + a.getNombre() + " Nota " + a.getNota());
		}
		System.out.println("-------------");
	}
	
	public static void main(String[] args) {
		List<Alumno> listaAlumnos = new ArrayList<Alumno>();//<> operador diamante
		
		Alumno alumno1 = new Alumno("Jesús", 10);
		Alumno alumno2 = new Alumno("Dani", 8);
		Alumno alumno3 = new Alumno("Nagore", 10);
		
		listaAlumnos.add(alumno1);
		listaAlumnos.add(alumno2);
		listaAlumnos.add(alumno3);
		
		System.out.println("La lista tiene " + listaAlumnos.size() + " alumnos");
		System.out.println("Orden Inserción");
		mostrarListaAlumnos(listaAlumnos);
		
		System.out.println("Orden Aleatorio");
		Collections.shuffle(listaAlumnos);//barajear
		mostrarListaAlumnos(listaAlumnos);
		
		System.out.println("Ordenamos por NOTA");
		Collections.sort(listaAlumnos, ( a1,  a2) -> {
			return a1.getNota() -a2.getNota(); //ordenamos de menor a mayor y a2.getNota() -a1.getNota() de mayor a menor
		});
		
		mostrarListaAlumnos(listaAlumnos);
		
		System.out.println("Ordenamos por NOMBRE");
		Collections.sort(listaAlumnos, ( a1,  a2) -> {
			return a1.getNombre().compareTo(a2.getNombre()); 
		});
		
		mostrarListaAlumnos(listaAlumnos);
		
		System.out.println("Ordenamos por NOTA Y NOMBRE");
		Collections.sort(listaAlumnos, (a1, a2) -> {
			int result = Integer.compare(a2.getNota(), a1.getNota());
			
			if (result == 0) {
				result = a1.getNombre().compareTo(a2.getNombre());
			}
			
			return result;
		});
		
		mostrarListaAlumnos(listaAlumnos);
	}

}






