import java.util.Scanner;

public class Ejercicio_12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String nombre="";
		double ht=0,v=0,st=0;
		System.out.print("Digite su nombre: ");
		nombre=in.nextLine();
		System.out.print("Digite las horas trabajadas en la semana: ");
		ht=in.nextDouble();
		System.out.print("Digite el valor recibido por una hora normal de trabajo: ");
		v=in.nextDouble();
		
		if (ht>48) {
			st=(40*v)+(16*v)+((ht-48)*v*3);
			System.out.println("El trabajador "+nombre+" devengó: "+"$"+st);
		}else if((ht<=48)&(ht>40)){
			st=(40*v)+((ht-40)*v*2);
			System.out.println("El trabajador "+nombre+" devengó: "+"$"+st);
		}else {
			st=ht*v;
			System.out.println("El trabajador "+nombre+" devengó: "+"$"+st);
		}

	}

}
