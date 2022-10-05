//Se importó Scanner
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Se agregó correctamente la instrucción usando comillas dobles para abrir y cerrar.
		//El error estaba en abrir con comillas dobles y cerrar con simples.
		//Se corrigió el Scanner para texto y se añadió para números.
		System.out.print("Introduzca un número: ");
		Scanner s = new Scanner(System.in);
	    int ni = s.nextInt();
	    
	    //Initialization
	    int c = ni;
	    int afo = 0;
	    int noAfo = 0;
	    while (ni > 0) {
		  int digito = (int)(ni % 10);
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
	      } else {
			noAfo++;
	    }//else
	      ni /= 10;
	      //Se posicionó la condición ni /=10 fuera de else.
	    if (afo > noAfo) {
	    	//Se corrigió impresión
	      System.out.println("El " + c + " es un número afortunado.");
	    } else {
	      System.out.println("El " + c + " no es un número afortunado.");
	    }//else
	    
	  }//while

		
	s.close();
	}//main
}//class Ejercicio5
