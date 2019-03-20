import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTeste {
	Calculadora calc = new Calculadora();

	@Test
	public void testeSomar() {
		int nro1 = 5;
		int nro2 = 5;
		int resultadoEsperado = 10;
		int resultadoReal = calc.somar(nro1, nro2);
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	public void testeSubtrair() {
		int nro1 = 3;
		int nro2 = 5;
		int resultadoEsperado = 2;
		int resultadoReal = calc.subtrair(nro1, nro2);
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	public void testeMultiplicar() {
		int nro1 = 3;
		int nro2 = 3;
		int resultadoEsperado = 9;
		int resultadoReal = calc.multiplicar(nro1, nro2);
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	public void testeDividir() {
		int nro1 = 2;
		int nro2 = 6;
		int resultadoEsperado = 3;
		int resultadoReal = calc.dividir(nro1, nro2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
}
