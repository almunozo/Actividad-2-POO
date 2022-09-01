import java.util.Scanner;
public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1, n2, n3;
        System.out.print("Digite el primer número: ");
        n1 = in.nextInt();
        System.out.print("Digite el segundo número: ");
        n2 = in.nextInt();
        System.out.print("Digite el tercer número: ");
        n3 = in.nextInt();
        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println("El valor mayor entre "+n1+" "+n2+" y "+n3+" es: " + n1);                                             
            } else {
                System.out.println("El valor mayor entre "+n1+" "+n2+" y "+n3+" es: " + n3);     
            }
        } else if (n2 > n3) {
            System.out.println("El valor mayor entre "+n1+" "+n2+" y "+n3+" es: " + n2);
        } else {
            System.out.println("El valor mayor entre "+n1+" "+n2+" y "+n3+" es: " + n3);
        }
    }
}


	


