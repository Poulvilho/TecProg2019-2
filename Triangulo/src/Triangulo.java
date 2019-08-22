
public class Triangulo {
	private int x,
				y,
				z;
	
	public boolean setarTriangulo (int a, int b, int c) {
		if(a + b > c && a + c > b && b + c > a) {
			this.x = a;
			this.y = b;
			this.z = c;
			
			return true;
		} else {
			return false;
		}
	}
}
