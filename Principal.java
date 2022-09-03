package paquete;
import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("ingrese el radio del circulo:");
        int radio =leer.nextInt();
        System.out.print("ingrese la base y altura del rectangulo:");
        int baseo =leer.nextInt();
        int alturao =leer.nextInt();
        System.out.print("ingrese la base y altura del triangulo:");
        int base =leer.nextInt();
        int altura =leer.nextInt();
        System.out.print("ingrese el lado del cuadrado:");
        int lado =leer.nextInt();


        class Círculo {
            int radio;
            Círculo(int radio) {
                this.radio = radio;
            }

            double calcularArea() {
                return Math.PI*Math.pow(radio,2);
            }

            double calcularPerímetro() {
                return 2*Math.PI*radio;
            }
        }
        class Rectángulo {
            int baseo,alturao;
            Rectángulo(int baseo, int alturao) {
                this.baseo = baseo;
                this.alturao = alturao;
            }
            double calcularArea() {
                return baseo * alturao;
            }double calcularPerímetro() {
                return (2 * baseo) + (2 * alturao);
            }
        }
        class Cuadrado {
            int lado;
            public Cuadrado(int lado) {
                this.lado = lado;
            }
            double calcularArea() {
                return lado*lado;
            }
            double calcularPerímetro() {
                return (4*lado);
            }
        }
        class TriánguloRectángulo {
        int base,altura;
            public TriánguloRectángulo(int base, int altura) {
                this.base = base;
                this.altura = altura;
            }
            double calcularArea() {
                return (base * altura / 2);
            }
            double calcularPerímetro() {
                return (base + altura + calcularHipotenusa());
            }
            double calcularHipotenusa() {
                return Math.pow(base*base + altura*altura, 0.5);
            }
            void determinarTipoTriángulo() {
                if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa()))
                    System.out.print("Es un triángulo equilátero");

                else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa()))
                    System.out.print("Es un triángulo escaleno");
                else
                    System.out.print("Es un triángulo isósceles");
            }}


                    Círculo figura1 = new Círculo(radio);
                    Rectángulo figura2 = new Rectángulo(baseo,alturao);
                    Cuadrado figura3 = new Cuadrado(lado);
                    TriánguloRectángulo figura4 = new TriánguloRectángulo(base,altura);
                    System.out.println("El área del círculo es = " + figura1.calcularArea());
                    System.out.println("El perímetro del círculo es = " + figura1.calcularPerímetro());
                    System.out.println();
                    System.out.println("l área del rectángulo es = "+ figura2.calcularArea());
                    System.out.println("El perímetro del rectángulo es = " + figura2.calcularPerímetro());
                    System.out.println();
                    System.out.println("El área del cuadrado es = " + figura3.calcularArea());
                    System.out.println("El perímetro del cuadrado es = " + figura3.calcularPerímetro());
                    System.out.println("El área del triángulo es = " + figura4.calcularArea());
                    System.out.println("El perímetro del triángulo es = " + figura4.calcularPerímetro());
                    figura4.determinarTipoTriángulo();
            }
    }



























































































































