import java.util.Scanner;
public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double lado=0,perimetro=0,h=0,area=0;
		System.out.println("Digite el valor del lado del triangulo:");
		lado=in.nextDouble();
		perimetro=lado*3;
		h=((Math.sqrt(3))*lado)/2;
		area= (lado*h)/2;
		System.out.println("El perimetro del triangulo equilatero es: "+perimetro);
		System.out.println("La altura del triangulo equilatero es: "+h);
		System.out.println("El area del triangulo equilatero:"+area);

	}

}
