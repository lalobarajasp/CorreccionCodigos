import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Se modifi� el orden para ingresar los datos primero y despu�s leerlos.
		//Se modific� el m�todo Scanner para que coincidiera con su designaci�n.
		//Se a�adi� el parametro System.in
		System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    Scanner s1 = new Scanner(System.in);
	    String j1 = s1.nextLine();
	   
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	    Scanner s2 = new Scanner(System.in);
	    String j2 = s2.nextLine();
	   
	    //Se agreg� el m�todo equals a todas las comparasiones para poder realizar las operaciones.
	    //Se a�adi� break al finalizar cada caso.
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
	            }//Se a�adi� llave de cierre condici�n if
	            break;
	            //Se escribi� correctamente tijeras
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
