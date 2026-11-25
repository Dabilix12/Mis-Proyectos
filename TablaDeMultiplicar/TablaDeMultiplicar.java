//En este ejercicio buscamos que el usuario nos de un numero entero entre el 1 y el 10 para hacerle la tabla de multiplicar.

//Nombre del proyecto (Carpeta)
package TablaDeMultiplicar;

//Importamos la libreria Scanner.
import java.util.Scanner;

//Nombre de el programa (Archivo).
public class TablaDeMultiplicar {
    
    //Creamos la clase main.
    public static void main (String[] args) {
    //Abreviamos la herramienta Scanner.
    Scanner sc = new Scanner(System.in);

    //Pedimos al usuario que nos introduzca un número entero entre el 1 y el 10.
    System.out.print("Introduzca un número entero del 1 al 10 para imprimir su tabla de multiplicar: ");

    //Guardamos el dato introducido por el usuario en la variable numeroEntero.
    int numeroEntero = sc.nextInt();

    //Creamos un if que hace que si el numero es menor o igual que 10 entra a la condición.
    if (numeroEntero <= 10) {
        //Cremos un bucle for dentro de la condición y creamos la variable i, que si es menor o igual a 10, lo que hace es que i sume 1 hasta que sea mas grande que 10.
        for (int i = 0; i <= 10; i++){
            System.out.println(numeroEntero + " * "  + i + " = " + numeroEntero * i);
        }
    } else {
        //Imprime por pantalla que el numero entero no estaba en el rango entre 1 y 10
        System.out.println("Tu numero entero no esta en el rango entre 1 y 10, introduzca otro numero");
    }
    }
}
