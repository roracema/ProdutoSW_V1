import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProdutoTeste {

	@Test
	void testGetPeso() {
		Produto prod = new Produto(10);
		double resultadoEsperado = 10;
		double peso = prod.getPeso();
		assertEquals(peso, resultadoEsperado);
	}

//	@Test
//	void testSetPeso() {
//		int peso = 10;
//		int resultadoEsperado = 10;
//		int resultadoReal = prod.setPeso(peso);
//		assertEquals(resultadoEsperado, resultadoReal);
//	}

}
