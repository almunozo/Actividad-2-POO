
import java.util.Scanner;
public class Ejercicio22 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nombre_empleado;
		int salario_hora;
		int numero_horas;
		System.out.println("Escriba el nombre del empleado: ");
		nombre_empleado = entrada.next();
		System.out.println("Escriba el salario por hora del empleado: ");
		salario_hora = entrada.nextInt();
		System.out.println("Escriba el numero de horas trabajadas ");
		numero_horas = entrada.nextInt();
		if ((salario_hora * numero_horas )> 450000) {
			System.out.println(nombre_empleado);
			System.out.println(salario_hora * numero_horas);
		}
		else {
			System.out.println(nombre_empleado);
			
		}
		
		
	}

}