import java.util.Scanner;
public class Ejercicio04 {
	public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingresa un número entero (1, 2, 3, 4, 6, 12): ");
        int numero = lectura.nextInt();
        String periodo;
        switch (numero) {
            case 1:
                periodo = "Mensual";
                break;
            case 2:
                periodo = "Bimestral";
                break;
            case 3:
                periodo = "Trimestral";
                break;
            case 4:
                periodo = "Cuatrimestral";
                break;
            case 6:
                periodo = "Semestral";
                break;
            case 12:
                periodo = "Anual";
                break;
            default:
                periodo = "Número no válido. Debe ser 1, 2, 3, 4, 6 o 12.";
                break;
        }
        System.out.println("El periodo anual correspondiente es: " + periodo);
        lectura.close();
    }
}

