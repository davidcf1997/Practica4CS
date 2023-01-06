package ucam.practica4.cs;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestPartition1 {
	
	Equipo e;
	ArrayList<Jugador> jugadoresPrueba = new ArrayList<>();
	Jugador jugadorPrueba = new Jugador("David", "España", 10, 25);
	
	@Before
	public void set() {
		e = new Equipo(null, 0, null);
		
		ArrayList<Jugador> jugadores = new ArrayList<>();
		String nombre = "FC Vigo";
		int anhoFundacion = 1980;
		Jugador j2 = new Jugador("James", "Inglaterra", 2, 35);
		
		e.setJugadores(jugadores);
		e.setAnhoFundacion(anhoFundacion);
		e.setNombre(nombre);
		
		e.añadirJugadorAEquipo(jugadorPrueba, e);
		e.eliminarJugador(e, jugadorPrueba);
		e.añadirJugadorAEquipo(j2, e);
		e.eliminarJugador(e, j2);
		
		e.añadirJugadorAEquipo(jugadorPrueba, e);		
	}

	@Test
	public void arrayJugadoresNoEsNulo() {
		assertNotNull(e.getJugadores());
		System.out.println("\narrayJugadoresNoEsNulo ejecutado correctamente.");
	}
	
	@Test
	public void arraysJugadoresSonIguales() {
		assertNotEquals(jugadoresPrueba, e.getJugadores());
		System.out.println("\narraysJugadoresSonIguales ejecutado correctamente.");
	}
	
	@Test
	public void jugadoresSonIguales() {
		jugadoresPrueba.add(jugadorPrueba);
		assertEquals(jugadoresPrueba.get(0), e.getJugadores().get(0));
		System.out.println("\njugadoresSonIguales ejecutado correctamente.");
	}
	
	@Test
	public void tamanhoArrayJugadoresEsDistinto() {
		assertTrue(jugadoresPrueba.size() == e.getJugadores().size());
		System.out.println("\ntamanhoArrayJugadoresEsDistinto ejecutado correctamente.");
	}
	
	@After
	public void finish() {
		e.eliminarTodosJugadores(e);
	}

}
