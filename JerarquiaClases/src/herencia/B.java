package herencia;

class B extends A {
	private int p;
	B(int p){
		System.out.println("Inside B's constructor.");
		this.p = p;
		System.out.println(p);
	}
}
