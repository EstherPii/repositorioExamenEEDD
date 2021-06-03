package ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CovidTest {

	static Covid cov = new Covid();
	
	@Test
	void testCalcularPrioridadVacunacion1() {
		int resultadoEsperado = 2;
		int resultadoReal = cov.calcularPrioridadVacunacion(65,1);
		Assertions.assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testCalcularPrioridadVacunacion2() {
		int resultadoEsperado = 3;
		int resultadoReal = cov.calcularPrioridadVacunacion(53,1);
		Assertions.assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void testCalcularPrioridadVacunacion3() {
		int resultadoEsperado = 1;
		int resultadoReal = cov.calcularPrioridadVacunacion(21,2);
		Assertions.assertEquals(resultadoEsperado, resultadoReal);
	}
	
}
