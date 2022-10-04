import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Se modifió el orden para ingresar los datos primero y después leerlos.
		//Se modificó el método Scanner para que coincidiera con su designación.
		//Se añadió el parametro System.in
		System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    Scanner s1 = new Scanner(System.in);
	    String j1 = s1.nextLine();
	   
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	    Scanner s2 = new Scanner(System.in);
	    String j2 = s2.nextLine();
	   
	    //Se agregó el método equals a todas las comparasiones para poder realizar las operaciones.
	    //Se añadió break al finalizar cada caso.
	    if (j1.equals(j2)) {
			System.out.println("Empate");
	      } else {
	      
	        int g = 2;
	        switch(j1) {
	          case "piedra":
	            if (j2.equals("tijeras") ) {
	              g = 1;
	            }
	            break;
	          case "papel":
	            if (j2.equals("piedra")) {
	              g = 1;
	            }//Se añadió llave de cierre condición if
	            break;
	            //Se escribió correctamente tijeras
	          case "tijeras":
	            if (j2.equals("papel")) {
	              g = 1;
	            } 
	            break;
	          default:
	        }
	        System.out.println("Gana el jugador " + g);
	      }//else
	    
	    
	    s1.close();
	    s2.close();
	}//main
}//class Ejercicio4
