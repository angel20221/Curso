import java.util.Scanner;


public class Suma {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Ingrese el numero: ");
        int a = s.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int b = s.nextInt();

        int resultado = a + b;

        System.out.println("La suma es: "+resultado);
    }
}
