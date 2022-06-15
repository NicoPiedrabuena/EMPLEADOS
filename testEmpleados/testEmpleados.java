import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

class testEmpleados {

	@Test
	void queSePuedaCrearUnSistema() {
	String nombreSistema = "TELECOM";
	Sistema sistema = new Sistema(nombreSistema);
	
	assertNotNull(sistema);

	}
	@Test 
	void queSePuedaAgregarUnEmpleado() {
		String nombreSistema = "TELECOM";
		Sistema sistema = new Sistema(nombreSistema);
		
		String nombreEmpleado ="ricardo gomez";
		Integer salario = 2000;
		LocalDate fechaCumplea�os = LocalDate.of(1994, Month.JANUARY, 31);
		
		Empleado nuevo = new Empleado (nombreEmpleado,salario,fechaCumplea�os);
		sistema.agregarEmpleado(nuevo);
		Integer numeroEmpleado = 0;
		assertEquals(salario, sistema.llamarEmpleado(numeroEmpleado).getSalario());
	}
	
	@Test 
	void queSePuedaAgregarUnGerente() {
		String nombreSistema = "TELECOM";
		Sistema sistema = new Sistema(nombreSistema);
		
		String nombreEmpleado ="ricardo gomez";
		Integer salario = 2000;
		Integer numeroDeCochera = 2;
		LocalDate fechaCumplea�os = LocalDate.of(1994, Month.JANUARY, 31);
		Cochera cochera = new Cochera(numeroDeCochera);
	
		Empleado nuevo = new Gerente (nombreEmpleado, salario,fechaCumplea�os,cochera);
		Integer numeroEmpleado = 0;
		sistema.agregarEmpleado(nuevo);
		assertEquals(salario, sistema.llamarEmpleado(numeroEmpleado).getSalario());
		assertTrue(sistema.getEmpleados().contains(nuevo));
	}
	@Test
	void queSePuedaAgregarUnDirector() {
		
		String nombreSistema = "TELECOM";
		Sistema sistema = new Sistema(nombreSistema);
		
		String nombreEmpleado ="ricardo gomez";
		Integer salario = 2000;
		Integer numeroDeCochera = 2;
		LocalDate fechaCumplea�os = LocalDate.of(1994, Month.JANUARY, 31);
		Cochera cochera = new Cochera(numeroDeCochera);
		Integer salarioExtra = 500;
		
		Integer salarioTotalEsperado=2500;
	
		Empleado nuevo = new Director (nombreEmpleado, salario,fechaCumplea�os,cochera,salarioExtra);
		sistema.agregarEmpleado(nuevo);
		assertEquals(salarioTotalEsperado,sistema.getEmpleados().get(0).getSalario());
	}
	@Test
	void queSePuedanOrdenarLosEmpleadosPorApellido() {
		String nombreSistema = "TELECOM";
		Sistema sistema = new Sistema(nombreSistema);
		
		String nombreEmpleado ="Gomez";
		Integer salario = 2000;
		LocalDate fechaCumplea�os = LocalDate.of(1994, Month.JANUARY, 31);
	
		String nombreEmpleado1 ="Perez";
		Integer salario1 = 2000;
		LocalDate fechaCumplea�os1 = LocalDate.of(1994, Month.JANUARY, 31);
		
		String nombreEmpleado2 ="Ardo";
		Integer salario2 = 2000;
		LocalDate fechaCumplea�os2 = LocalDate.of(1994, Month.JANUARY, 31);
		
		Empleado nuevo = new Empleado (nombreEmpleado, salario,fechaCumplea�os);
		Empleado nuevo1 = new Empleado (nombreEmpleado1, salario1,fechaCumplea�os1);
		Empleado nuevo2 = new Empleado (nombreEmpleado2, salario2,fechaCumplea�os2);
		
		sistema.agregarEmpleado(nuevo);
		sistema.agregarEmpleado(nuevo1);
		sistema.agregarEmpleado(nuevo2);
		
		TreeSet<Empleado>listaObtenida = sistema.empleadosOrdenadosPorNombre();
		assertEquals(listaObtenida.first().getNombre(),nuevo2.getNombre());
		
	}
}
