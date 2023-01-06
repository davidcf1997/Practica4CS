public class Jugador {
	
	private String nombre;
	private String nacionalidad;
	private int dorsal;
	private int edad;

	public Jugador(String nombre, String nacionalidad, int dorsal, int edad) {
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.dorsal = dorsal;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "jugador [nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", dorsal=" + dorsal + ", edad=" + edad
				+ "]";
	}

}
