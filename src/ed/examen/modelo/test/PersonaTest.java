package ed.examen.modelo.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import ed.examen.modelo.Persona;

class PersonaTest {
    Persona p1= new Persona("12312312P","Mario","Lopez");
	@Test
	final void testPersonaStringStringString() {
		assertNotNull(p1);
		assertEquals("12312312P", p1.getDni());
		assertEquals("Mario", p1.getNombre());
		assertEquals("Lopez", p1.getApellido1());
	}

	@Test
	final void testGetDni() {
		assertEquals("12312312P", p1.getDni());
	}

	@Test
	void testSetDni() {
		try {
			p1.setDni("12312312P");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals("12312312P", p.getDni());
		
		boolean exceptionLanzada=false;
		try {
			p1.setDni("000000000");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			exceptionLanzada=true;
		}
		assertTrue(exceptionLanzada);
	}

	@Test
	final void testGetNombre() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	final void testSetNombre() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	final void testGetApellido1() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	final void testSetApellido1() {
		fail("Not yet implemented"); // TODO
	}

}
