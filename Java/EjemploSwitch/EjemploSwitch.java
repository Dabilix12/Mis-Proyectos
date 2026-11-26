package Java.EjemploSwitch;
import java.util.Scanner;

public class EjemploSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Eliga un número del 1 al 7 y saldra un día de la semana: ");
        int dia= sc.nextInt();

        switch (dia) {
            case 1:
                System.out.println("El número " + dia + " es el Lúnes" );
                break;
            case 2:
                System.out.println("El número " + dia + " es el Martes" );
                break;
            case 3:
                System.out.println("El número " + dia + " es el Miercoles" );
                break;
            case 4:
                System.out.println("El número " + dia + " es el Jueves" );
                break;
            case 5:
                System.out.println("El número " + dia + " es el Viernes" );
                break;
            case 6:
                System.out.println("El número " + dia + " es el Sabado" );
                break;
            case 7:
                System.out.println("El número " + dia + " es el Domingo" );
                break;
            default: 
                System.out.println("Solo hay 7 dias en la semana");
        }
    }
}
