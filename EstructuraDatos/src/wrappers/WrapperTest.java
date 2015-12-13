package wrappers;

public class WrapperTest {

	public static void main(String[]args) {
		Integer i1 = new Integer(3);
		Integer i2 = new Integer(3);
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
	}
}
