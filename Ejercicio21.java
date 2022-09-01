import java.util.Scanner;
public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double l1=0,l2=0,l3=0,perimetro=0,semiperimetro=0,area=0;
		System.out.println("Digite el lado 1");
		l1=in.nextDouble();
		System.out.println("Digite el lado 2");
		l2=in.nextDouble();
		System.out.println("Digite el lado 3");
		l3=in.nextDouble();
		perimetro=l1+l2+l3;
		semiperimetro=perimetro/2;
		area=Math.sqrt(semiperimetro*(semiperimetro-l1)*(semiperimetro-l2)*(semiperimetro-l3));
		System.out.println("El perimetro del triangulo es: "+perimetro);
		System.out.println("El semiperimetro del triangulo es: "+semiperimetro);
		System.out.println("El area es: "+area);
		

	}

}
