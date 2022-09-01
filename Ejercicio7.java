import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a=0,b=0;
		System.out.println("Digite el valor del numero A: ");
		a=in.nextDouble();
		System.out.println("Digite el valor del numero B: ");
		b=in.nextDouble();
		if (a>b) {
			System.out.println("A es mayor que B");
		}else if (a==b) {
			System.out.println("A es igual que B");
		}else {
			System.out.println("A es menor que B");
		}

	}

}
