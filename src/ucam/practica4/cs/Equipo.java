package ucam.practica4.cs;

import java.util.ArrayList;

public class Equipo {
	
	private String nombre;
	private int anhoFundacion;
	private ArrayList<Jugador> jugadores;

	public Equipo(String nombre, int anhoFundacion, ArrayList<Jugador> jugadores) {
		this.nombre = nombre;
		this.anhoFundacion = anhoFundacion;
		this.jugadores = jugadores;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnhoFundacion() {
		return anhoFundacion;
	}

	public void setAnhoFundacion(int anhoFundacion) {
		this.anhoFundacion = anhoFundacion;
	}

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	
	public static Jugador existeJugador(ArrayList<Jugador> jugadores, int dorsal) {
		Jugador j = null;
		
		for (Jugador jug1 : jugadores) {
			if (jug1.getDorsal() == dorsal) {
				j = jug1;
			}
		}
		
		return j;
	}
	
	public void mostrarDorsalesJugadores(ArrayList<Jugador> jugadores) {
		for (Jugador jug1 : jugadores) {
			System.out.println(jug1.getDorsal());
		}
	}
	
	public Jugador getJugadorPorDorsal(Equipo e, int dorsal) {
		Jugador j1 = null;
		
		for (Jugador j : e.getJugadores()) {
			if (j.getDorsal() == dorsal) {
				j1 = j;
			}
		}
		
		return j1;
	}
	
	public int contarJugadores(Equipo e) {
		int numJugadores = 0;
		
		for (Jugador jug1 : e.getJugadores()) {
			numJugadores++;
		}
		
		return numJugadores;
	}
	
	public static String crearNombreEquipo(String ciudad) {
		String nombreEquipo = "";
		
		nombreEquipo = "FC ".concat(ciudad);
		
		return nombreEquipo;
	}
	
	public int eliminarTodosJugadores(Equipo e) {
		int exito = 0;
		
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		e.setJugadores(jugadores);
		
		return exito;
	}
	
	public void eliminarJugador(Equipo e, Jugador j1) {
		e.getJugadores().remove(j1);
	}
	
	public void añadirJugadorAEquipo(Jugador j, Equipo e) {
		e.getJugadores().add(j);
	}
	
	public int[] getDorsalesJugadores(Equipo e) {
		int[] dorsales = new int[10];;

		for (int i = 0; i < e.getJugadores().size(); i++) {
			dorsales[i] = e.getJugadores().get(i).getDorsal();
		}
		
		return dorsales;
	}

}
