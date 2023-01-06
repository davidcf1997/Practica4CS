package ucam.practica4.cs;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestJUnit {
	
	static String nombreEquipo1 = "FC Coruña";
	static String nombreEquipo2 = "UCAM Murcia";
	
	static Jugador j1;
	static Jugador j2;
		
	static Equipo e1;
	static Equipo e2;

	String ciudad = "Coruña";
	
	ArrayList<Jugador> jugadores;

	
	@BeforeClass
	public static void inicializarVariables() {
		j1 = new Jugador("Jose", "español", 10, 20);
		j2 = new Jugador("Ignacio", "argentino", 8, 36);
		
		e1 = new Equipo(nombreEquipo1, 1970, null);
		e2 = new Equipo(nombreEquipo2, 1980, null);
		
		System.out.println("\nBeforeClass inicializamos las variables.");
	}
	
	@Before
	public void asignar() {
		jugadores = new ArrayList<Jugador>();
		jugadores.add(j1);
		jugadores.add(j2);
		
		e1.setJugadores(jugadores);
		e2.setJugadores(jugadores);
		
		System.out.println("\nBefore asignamos las variables.");
	} 
	
	@After
	public void desasignar() {
	   jugadores.clear();
		System.out.println("\nAfter desasignamos las variables.");

	}
	
	@AfterClass
	public static void eliminarVariables() {
		j1 = null;
		j2 = null;
		
		e1 = null;
		e2 = null;
		
		System.out.println("\nAfterClass inicializamos las variables.");
	}
	
	@Ignore("No hecho todavia")
	public static void jugarPartido(Equipo local, Equipo visitante) {
		
	}
	
	@Test
	public void comparaNombresEquipo() {
		assertEquals(nombreEquipo1, e1.crearNombreEquipo(ciudad));
		System.out.println("\ncomparaNombresEquipo ejecutado correctamente.");
	}
	
	@Test
	public void comparaNumJugadores() {
		int numJugadores = 3;
		assertTrue(numJugadores == e2.contarJugadores(e2));
		System.out.println("\ncomparaNumJugadores ejecutado correctamente.");
	}
	
	@Test
	public void comparaEquipos() {
		e2.añadirJugadorAEquipo(j1, e2);
		assertFalse(e1.equals(e2));
		System.out.println("\ncomparaEquipos ejecutado correctamente.");
	}
	
	@Test
	public void jugadorNoEsNulo() {
		e1.añadirJugadorAEquipo(j1, e1);
		assertNotNull(e1.existeJugador(jugadores, 50));
		System.out.println("\njugadorNoEsNulo ejecutado correctamente.");
	}
	
	@Test
	public void esNuloArrayJugadores() {
		assertNull(e1.getJugadores());
		System.out.println("\nesNuloArrayJugadores ejecutado correctamente.");
	}	
	
	@Test
	public void comparaJugadores() {
		e1.añadirJugadorAEquipo(j1, e1);
		assertSame(e1.getJugadorPorDorsal(e1, 10), j2);
		System.out.println("\nañadirJugadorAEquipo ejecutado correctamente.");
	}
	
	@Test
	public void comparaJugadoresDistintos() {
		e1.añadirJugadorAEquipo(j2, e1);
		assertNotSame(e1.getJugadorPorDorsal(e1, 10), j2);
		System.out.println("\ncomparaJugadoresDistintos ejecutado correctamente.");
	}
	
	@Test
	public void arrayJugadoresSonIguales() {
		e1.añadirJugadorAEquipo(j2, e1);
		e2.añadirJugadorAEquipo(j2, e2);
		assertArrayEquals(e1.getDorsalesJugadores(e1), e2.getDorsalesJugadores(e2));
		System.out.println("\narrayJugadoresSonIguales ejecutado correctamente.");
	}
}
