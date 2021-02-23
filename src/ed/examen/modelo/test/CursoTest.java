package ed.examen.modelo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ed.examen.modelo.Curso;
import ed.examen.modelo.Persona;

class CursoTest {

	Curso c= new Curso();
	
	@Test
	void testEliminarAlumno() {
		
		/*Parametro menor de 9 cifras
		 * Debe dar error ya que los dni son de 9 cifras*/
		boolean exceptionLanzada= false;
		try {
			c.eliminarAlumno("00");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			exceptionLanzada=true;
		}
		assertTrue(exceptionLanzada);
		
		
		/*Parametros de más de 9 cifras*/
		c.aniadirAlumno(new Persona("123456788","Carlos","Saenz"));
		/*probamos a eliminar un alumno que no existe*/
		exceptionLanzada=false;
		int tamanioBefore=c.numeroAlumnos();
		try {
			c.eliminarAlumno("123456789");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int tamanioAfter=c.numeroAlumnos();
		assertFalse(exceptionLanzada);
		/*como el alumno no existe, debe ser el mismo tamaño antes que despues*/
		assertEquals(tamanioBefore, tamanioAfter);
		
		/*probamos a eliminar persona que si existe*/
		exceptionLanzada=false;
		tamanioBefore=c.numeroAlumnos();
		try {
			c.eliminarAlumno("123456788");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tamanioAfter=c.numeroAlumnos();
		assertFalse(exceptionLanzada);
		/*como el alumno existia y se ha eliminado, el tamaño de despues debería
		 * ser el tamaño de antes, es decir el de despues+1*/
		assertEquals(tamanioBefore, tamanioAfter+1);
		
		
	}

	@Test
	void testAniadirAlumno() {
		/*Crear persona para meter en el metodo*/
		Persona p = new Persona("1231231231","Pepe","Pepo");
		int tamanoantes=c.numeroAlumnos();
		try {
			c.aniadirAlumno(p);
		} catch (Exception e) {
			e.printStackTrace();
		}
		int tamanodespues=c.numeroAlumnos();
		assertEquals(tamanoantes, tamanodespues-1);
		assertEquals("1231231231",p.getDni());
		assertEquals("Pepe", p.getNombre());
		assertEquals("Pepo", p.getApellido1());
	}


	@Test
	final void testEstaRegistrado() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	final void testCurso() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	final void testNumeroAlumnos() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	final void testMostrarTodos() {
		fail("Not yet implemented"); // TODO
	}

}
