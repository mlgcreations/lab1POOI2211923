import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese un número del 1 al 7 para conocer el día de la semana correspondiente:");

                int dayNumber = scanner.nextInt();

               switch (dayNumber) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número no válido. Debe ser un número entre 1 y 7.");
                break;
        }
    }
}
