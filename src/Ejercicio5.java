//Se import� Scanner
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Se agreg� correctamente la instrucci�n usando comillas dobles para abrir y cerrar.
		//El error estaba en abrir con comillas dobles y cerrar con simples.
		//Se corrigi� el Scanner para texto y se a�adi� para n�meros.
		System.out.print("Introduzca un n�mero: ");
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
	      //Se posicion� la condici�n ni /=10 fuera de else.
	    if (afo > noAfo) {
	    	//Se corrigi� impresi�n
	      System.out.println("El " + c + " es un n�mero afortunado.");
	    } else {
	      System.out.println("El " + c + " no es un n�mero afortunado.");
	    }//else
	    
	  }//while

		
	s.close();
	}//main
}//class Ejercicio5
