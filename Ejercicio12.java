
public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double horas=48,slbruto=0,rfuente=0,slneto=0;
		slbruto=horas*5000;
		rfuente=slbruto*0.125;
		slneto=slbruto-rfuente;
		System.out.println("Su salario bruto es: "+slbruto);
		System.out.println("La retencion en la fuente es de: "+rfuente);
		System.out.println("Su salario neto es: "+slneto);
	}
}
