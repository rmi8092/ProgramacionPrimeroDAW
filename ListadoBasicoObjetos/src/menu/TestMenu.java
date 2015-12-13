package menu;

public class TestMenu {
	public static void main (String args[]){
		
		Menu menu1 = new Menu ("Menú fin de semana", 5, new String[] {"cine", "concierto", "juegos", "copas", "salir"});
		
		do{
			menu1.gestionar();
		}while(true);
	}
}
