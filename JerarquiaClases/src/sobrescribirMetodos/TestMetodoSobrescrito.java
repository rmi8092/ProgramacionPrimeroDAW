package sobrescribirMetodos;

/**
 * 
 * @author lmagarin
 *
 */
public class TestMetodoSobrescrito {

	public static void main(String[] args) {
		A a = new A(1, 2f);
		B b = new B(3, 4f, 'z');
		
		System.out.println(b.toString());
		System.out.println(((A)b).toString());
	}

}
