
import java.util.Scanner;
public class Ejercicio24 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double a, b, c;
		System.out.println("Escriba el peso de la esfera a ");
		a = entrada.nextDouble();
		System.out.println("Escriba el peso de la esfera b");
		b= entrada.nextDouble();
		System.out.println("Escriba el peso de la esfera c");
		c = entrada.nextDouble();
		if((a>b)&&(a>c)) {
			System.out.println("La esfera de mayor peso es a: " + a);
		}
		else if((b>a)&&(b>c)) {
			System.out.println("La esfera de mayor peso es b: " + b);
		}
		else {
			System.out.println("La esfera de mayor peso es c: " + c);
		}
	}
}
