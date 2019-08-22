/*
 *Teste parametrizado para cálculo de PA
 *
 * a0 = 1, r = 2, n = 5 -> 1,3,5,7,9
 * 						-> soma = 25
 * 
 * a1 = 0, r = 3, n = 4 -> 0,3,6,9
 * 						-> soma = 18
 * 
 * a2 = 2, r = 1, n = 6 -> 2,3,4,5,6,7
 * 						-> soma = 27
*/

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class tstProgressaoAritmetica {
	
	private int a0,
				r,
				n;
	
	private RespostaEsperada respostaEsperada;
	
	public tstProgressaoAritmetica (int a, int b, int c, RespostaEsperada d) {
		this.a0 = a;
		this.r = b;
		this.n = c;
		this.respostaEsperada = d;
	}

	@Parameters
	public static Iterable<Object[]> getParameters() {
		Object[][] resposta = new Object[][] {
			{1, 2, 5, new RespostaEsperada (
					new int[] {1, 3, 5, 7, 9}, 25
					)},
			{0, 3, 4, new RespostaEsperada (
					new int[] {0, 3, 6, 9},	18
					)},
			{2, 1, 6, new RespostaEsperada (
					new int[] {2, 3, 4, 5, 6, 7}, 27
					)}
		};
		
		return Arrays.asList(resposta);
	}
	
	@Test
	public void test() {
		ProgressaoAritmetica PA = new ProgressaoAritmetica (a0, r, n);
		
		assertEquals(respostaEsperada.PACompleta, PA.sequenciaPA());
		assertEquals(respostaEsperada.somaPA, PA.somaSequencia());
	}
	
}
