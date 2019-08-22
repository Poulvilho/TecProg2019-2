
public class ProgressaoAritmetica {
	
	private int a0, r, n;
	
	public ProgressaoAritmetica (int a, int r, int n) {
		
		this.a0 = a;
		this.r = r;
		this.n = n;
	}
	
	public int somaSequencia() {
		
		return (a0 + (a0 + (n - 1) * r) * n) / 2;
	}
	
	public int[] sequenciaPA() {
		
		int[] list = new int[n];
		int count = 0;
		
		while (count < n) {
			list[count] = (a0 + (count * r));
		    count++;
		}
		return list;
	}
	
}
