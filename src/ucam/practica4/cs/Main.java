package ucam.practica4.cs;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		String club = "Fene FC";
		String nombre = "Francisco";

		Jugador j1 = new Jugador("Jose", "España", 9, 25);
		Jugador j2 = new Jugador(nombre, "España", 10, 17);
		
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		try {
			jugadores.add(j1);
			jugadores.add(j2);
		} catch(Exception e) {
			e.printStackTrace();
		}
				
		Equipo e = new Equipo(club, 0, jugadores);
		
		System.out.println("******************");
		e.mostrarDorsalesJugadores(jugadores);
		System.out.println("******************");
		
		System.out.println("\n\n------------------");
		e.eliminarJugador(e, j1);
		e.mostrarDorsalesJugadores(jugadores);
		System.out.println("------------------");
		
		System.out.println("\n\n//////////////////");
		jugadores.add(j1);
		e.mostrarDorsalesJugadores(jugadores);
		System.out.println("/////////////////");
	}

}
