package expresionesRegulares;

import java.io.Console;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

import utiles.Teclado;

public class RegexTestHarness {

    public static void main(String[] args){
        
//    	Console console = System.console();
//        if (console == null) {
//            System.err.println("No console.");
//            System.exit(1);
//        }
        
    	while (true) {

            Pattern pattern = 
            Pattern.compile(Teclado.leerCadena("%nEnter your regex: "));

            Matcher matcher = 
            pattern.matcher(Teclado.leerCadena("Enter input string to search: "));

            boolean found = false;
            while (matcher.find()) {
               System.out.format("I found the text" +
                    " \"%s\" starting at " +
                    "index %d and ending at index %d.%n",
                    matcher.group(),
                    matcher.start(),
                    matcher.end());
                found = true;
            }
            if(!found){
                System.out.format("No match found.%n");
            }
        }
    }
}
		    

