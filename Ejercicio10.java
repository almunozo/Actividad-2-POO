import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double p=0,pm=50000,vm=0;
		int es=0;
		String  n="",ni="";
		System.out.println("Digite el numero de inscripcion: ");
		ni=in.nextLine();
		System.out.println("Digite su nombre: ");
		n=in.nextLine();
		System.out.println("Digite el valor de su patrimonio: ");
		p=in.nextDouble();
		System.out.println("Digite el numero de su estrato social: ");
		es=in.nextInt();
		
		if ((p>2000000)&(es>3)) {
			vm=pm+(0.03*p);
			System.out.println("El estudiante con numero de inscripcion "+ni+" y nombre "+n+ " debe pagar "+"$"+vm);
		
		}else {
			System.out.println("El estudiante con numero de inscripcion "+ni+" y nombre "+n+ " debe pagar "+"$"+pm);
		}

	}

}
