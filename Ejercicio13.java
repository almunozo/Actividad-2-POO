
import java.util.Scanner;
public class Ejercicio13 {
	public static void main(String[] args) {
		Scanner compraycolor = new Scanner(System.in);
		double VALCOMP;
		String COLOR;
		double VALPAG;
		double PDES;
		System.out.println("Ingrese el valor de la compra: ");
		VALCOMP = compraycolor.nextDouble();
		System.out.println("Ingrese el color de la bola: ");
		COLOR = compraycolor.next();
		if (COLOR.equals("BLANCO")){
			PDES = 0;
		}
		else if (COLOR.equals("VERDE")){
			PDES = 10;
		}
		else if (COLOR.equals("AMARILLO")){
			PDES = 25;
		}
		else if (COLOR.equals("AZUL")){
			PDES = 50;
		}
		else {
			PDES = 100;
		}
		VALPAG = VALCOMP -((PDES/100)*VALCOMP);
		System.out.println("EL CLIENTE DEBE PAGAR:$ " + VALPAG);
		System.out.println(" VALCOMP: " + VALCOMP + " COLOR: " + COLOR + " PDES: " + PDES + " VALPAG: " + VALPAG);
		
		
	}
	
}
