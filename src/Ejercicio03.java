import java.util.Scanner;
public class Ejercicio03 {
	public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese un n�mero entero entre 1 y 6: ");
        int numero = lectura.nextInt();
        switch (numero) {
            case 1:
                System.out.println("El n�mero en ingl�s es: One");
                break;
            case 2:
                System.out.println("El n�mero en ingl�s es: Two");
                break;
            case 3:
                System.out.println("El n�mero en ingl�s es: Three");
                break;
            case 4:
                System.out.println("El n�mero en ingl�s es: Four");
                break;
            case 5:
                System.out.println("El n�mero en ingl�s es: Five");
                break;
            case 6:
                System.out.println("El n�mero en ingl�s es: Six");
                break;
            default:
                System.out.println("Error: Debe ingresar un n�mero entre 1 y 6.");
                break;
        }
        lectura.close();
    }
}


