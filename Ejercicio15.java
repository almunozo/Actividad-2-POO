
import java.util.Scanner;
public class Ejercicio15 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int PESOA, PESOB, PESOC, PESOD;
		System.out.println("INGRESE EL PESO DE LA ESFERA A ");
		PESOA = entrada.nextInt();
		System.out.println("INGRESE EL PESO DE LA ESFERA B");
		PESOB = entrada.nextInt();
		System.out.println("INGRESE EL PESO DE LA ESFERA C ");
		PESOC = entrada.nextInt();
		System.out.println("INGRESE EL PESO DE LA ESFERA D30 ");
		PESOD = entrada.nextInt();
		if((PESOA == PESOB) && (PESOA == PESOC)){
			if(PESOD>PESOA) {
				System.out.println("LA ESFERA D ES LA DIFERENTE Y");
			}
			else {
				System.out.println("LA ESFERA D ES LA DIFERENTE Y");
			}
		}
		else if ((PESOA == PESOB) && (PESOA == PESOD)) {
			System.out.println("LA ESFERA C ES LA DIFERENTE Y");
			if(PESOC > PESOA) {
				System.out.println("Y ES DE MAYOR PESO");
				
			}else {
				System.out.println("Y ES DE MENOR PESO");
			}
		}
		else if ((PESOA == PESOC) && (PESOA == PESOD)) {
			System.out.println("LA ESFERA B ES LA DIFERENTE");
			if ( PESOB>PESOD) {
				System.out.println("Y ES DE MAYOR PESO");
			}else {
				System.out.println("Y ES DE MENOR PESO");
			}
		}
		else{
			System.out.println("LA ESFERA A ES LA DIFERENTE");
			if (PESOA>PESOB) {
				System.out.println("Y ES DE MAYOR PESO");
				
			}else {
				System.out.println("Y ES DE MENOR PESO");
			}
		}
	    
		
	}

}
