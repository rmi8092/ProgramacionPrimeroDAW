package StringBuffer;

public class StringBufferTest {

	public static void main(String[]args) {
		StringBuffer sb1 = new StringBuffer("abababab");
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		sb1.setCharAt(sb1.length()-1, 'B');
		System.out.println(sb1);
		sb1.replace(2, 3, "AB");
		System.out.println(sb1);
		sb1.insert(4,"CD");
		System.out.println(sb1);
		sb1.delete(0,2);
		System.out.println(sb1);
		
		System.out.println();
		
		StringBuffer sb2 = new StringBuffer(2);
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		for(int i=0; i<10; i++)
			sb2.append(i);
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		System.out.println(sb2);
	}

}
