package CirculoB;

public class Punto {

	private int x;
	private int y;
	
	public Punto(int x, int y) {
		setX(x);
		setY(y);
	}

	private void setX(int x) {
		this.x = x;
	}

	private void setY(int y) {
		this.y = y;		
	}

	private int getX() {
		return x;
	}

	private int getY() {
		return y;
	}

	@Override
	public String toString() {
		return "Punto [x=" + getX() + ", y=" + getY() + "]";
	}
}
