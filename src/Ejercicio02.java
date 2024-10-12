import java.util.Scanner;
public class Ejercicio02 {
	public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese un número entero entre 1 y 10: ");
        int numero = lectura.nextInt();
        switch (numero) {
            case 1:
                System.out.println("El número en romano es: I");
                break;
            case 2:
                System.out.println("El número en romano es: II");
                break;
            case 3:
                System.out.println("El número en romano es: III");
                break;
            case 4:
                System.out.println("El número en romano es: IV");
                break;
            case 5:
                System.out.println("El número en romano es: V");
                break;
            case 6:
                System.out.println("El número en romano es: VI");
                break;
            case 7:
                System.out.println("El número en romano es: VII");
                break;
            case 8:
                System.out.println("El número en romano es: VIII");
                break;
            case 9:
                System.out.println("El número en romano es: IX");
                break;
            case 10:
                System.out.println("El número en romano es: X");
                break;
            default:
                System.out.println("Error: Debe ingresar un número entre 1 y 10.");
                break;
        }
        lectura.close();
    }
}
