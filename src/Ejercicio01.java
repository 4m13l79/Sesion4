import java.util.Scanner;
public class Ejercicio01 {
	public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese un número entero entre 1 y 5: ");
        int numero = lectura.nextInt();
        switch (numero) {
            case 1:
                System.out.println("El número ingresado es: Uno");
                break;
            case 2:
                System.out.println("El número ingresado es: Dos");
                break;
            case 3:
                System.out.println("El número ingresado es: Tres");
                break;
            case 4:
                System.out.println("El número ingresado es: Cuatro");
                break;
            case 5:
                System.out.println("El número ingresado es: Cinco");
                break;
            default:
                // Si el número no está entre 1 y 5, se muestra un mensaje de error
                System.out.println("Error: Debe ingresar un número entre 1 y 5.");
                break;
        }
        lectura.close();
    }
}
