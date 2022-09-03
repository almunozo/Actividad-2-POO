
import java.util.Scanner;
public class Ejercicio23 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double a, b, c, resultado1, resultado2;
		System.out.println("Ingrese el parametro a de la ecuacion de segundo grado: ");
		a = entrada.nextDouble();
		System.out.println("Ingrese el parametro b de la ecuacion de segundo grado: ");
		b= entrada.nextDouble();
		System.out.println("Ingrese el parametro c de la ecuacion de segundo grado: ");
		c = entrada.nextDouble();
		double x1, x2;
		 if( a != 0 ) {
			 if( (b*b)-(4*a*c) >= 0 ) {
				 x1 = (-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);
		         x2 = (-b - Math.sqrt((b*b)-(4*a*c)))/(2*a);
		         System.out.println(" La solucion 1: " + x1 + " La solucion 2: " + x2);
			 }else {
				 System.out.println("Solo raices complejas");
				 
			 }
				 
		 }else {
			 System.out.println("La unica solucion es : " + -b/c);
			 
		 }	
	}
}