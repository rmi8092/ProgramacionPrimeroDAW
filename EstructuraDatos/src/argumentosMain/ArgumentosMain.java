package argumentosMain;

public class ArgumentosMain {

	public static void main(String[]args) {
		for(String i: args)
			System.out.print(i+" "); // el foreach no se puede usar para inicializar, solo para mostrar.
		
		for(int i=args.length-1; i>=0; i--)
			System.out.print(args[i].toUpperCase()+" ");
	}

}
