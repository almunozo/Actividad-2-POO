import java.util.Scanner;
public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double nhoras=0,vhora=0,porcentaje=0,slbruto=0,slneto=0,rfuente=0;
		String cdempleado="",nombres="";
		
		
		System.out.println("Digite el codigo del empleado:");
		cdempleado=in.nextLine();
		System.out.println("Digite los nombres del empleado:");
		nombres=in.nextLine();
		System.out.println("Digite las horas trabajadas en el mes:");
		nhoras=in.nextDouble();
		System.out.println("Digite el valor de la hora:");
		vhora=in.nextDouble();
		System.out.println("Digite el porcentaje de retencion en la fuente:");
		porcentaje=in.nextDouble();
		
		slbruto=nhoras*vhora;
		porcentaje=porcentaje/100;
		rfuente=slbruto*porcentaje;
		slneto=slbruto-rfuente;
		System.out.println("Su codigo de empleado es: "+cdempleado);
		System.out.println("Usted es: "+nombres);
		System.out.println("Su salario bruto es: "+slbruto);
		System.out.println("Su salario neto es: "+slneto);

	}

}
