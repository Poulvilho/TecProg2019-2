import static org.junit.Assert.*;

import org.junit.Test;

public class tstCondicaoTriangulo {
	
	Triangulo triangulo = new Triangulo();
	
	@Test
	public void testVerdadeiro() {
		assertEquals(true, triangulo.setarTriangulo(3, 4, 5));
		assertEquals(true, triangulo.setarTriangulo(5, 7, 8));
	}
	
	@Test
	public void testFalha() {
		assertEquals(false, triangulo.setarTriangulo(1, 2, 10));
		assertEquals(false, triangulo.setarTriangulo(1, 3, 9));
	}

}
