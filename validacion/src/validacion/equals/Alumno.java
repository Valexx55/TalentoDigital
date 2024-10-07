package validacion.equals;

public class Alumno {
	
	private String nombre;
	private int nota;
	
	//hacemos nuestro equals de alumno
	//cualquiera que quiera saber si dos alumnos son iguales
	//tiene que utilizar este equals!
	@Override
	public boolean equals(Object obj) {
		boolean iguales = false;
			
			//cuales son los dos objetos que tengo que comparar
			//cómo se llaman --> 1 es obj y el otro this
			if (obj!=null)
			{
				Alumno alumno = (Alumno) obj;//CASTING de Object a Alumno
				iguales = (this.nota==alumno.nota)&&(this.nombre.equals(alumno.nombre));
				
			}
					
		return iguales;
	}
	
	public Alumno(String nombre, int nota) {
		super();
		this.nombre = nombre;
		this.nota = nota;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	
	

}
