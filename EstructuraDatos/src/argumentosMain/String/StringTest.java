package argumentosMain.String;

public class StringTest {

	public static void main(String[]args) {
		String s1 = new String();
		String s2 = new String(" ababABAB ");
		String s3 = "Ejemplo";
		
		String s4 = new String("abc");
		String s5 = new String("abc");
		
		System.out.println(s1.compareTo(" "));
		System.out.println(s2.concat((s3)));
		System.out.println(s1.indexOf('h'));
		System.out.println(s2.trim());
		System.out.println(s2.toLowerCase());
		System.out.println(s3.toUpperCase());
		System.out.println(s2.indexOf('b'));
		System.out.println(s2.lastIndexOf('b'));
		System.out.println(s3.length());
		System.out.println(s3.charAt(1));
		System.out.println(s2.replace('A', 'x'));
		
		System.out.println(s4==s5);
		System.out.println(s4.equals(s5));
		

	}
}
