package sobrescribirMetodos;

public class A {
	int entero = 2;
	Float decimal = 5f;
	public A(int entero, Float decimal) {
		super();
		this.entero = entero;
		this.decimal = decimal;
	}
	@Override
	public String toString() {
		return "A [entero=" + entero + ", decimal=" + decimal + "]";
	}

	
}
