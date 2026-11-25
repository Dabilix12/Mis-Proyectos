//En este ejercicio buscamo que el usuario nos diga un año y nosotros le vamos a decir si es bisiesto o no.

//Paquete donde se encuentra el programa (Carpeta)
package AñoBisiesto;

//Necesitaremos importar la libreria Scanner.
import java.util.Scanner;

//Nombre de nuestro programa (archivo).
public class AñoBisiesto {
    //Clase main del programa
    public static void main(String[] args){
        
        //Abrebiamos la herramienta Scanner.
        Scanner sc = new Scanner(System.in);

        //Solicitamos al usuario que nos indique el año que quiere saber si es bisiesto o no.
        System.out.println("introduzca que año desea saber si es bisiesto: ");
        
        //Guardamos la variable año como el dato introducido por el usuario.
        int anio = sc.nextInt();

        //Creamos una condicion if/else
        /*Esta condicion if lo que hace es declarar que si anio al dividirlo entre 4 da de resto 0 puede entrar, PERO como tenemos un && (Y) lo que hace
        es que tambien divida el anio entre 100 para saber si al dividirlo entre 100 da de resto 0, si NO da 0, pasa directamente al if, y si SI da de resto 0,
        entrariamos directamente en la siguiente operación gracias a || (O) que divide el año entre 400, 
        si al dividir el anio entre 400 el resto sale 0, entrariamos directos al if e imprimiría que anio es bisiesto. 
        Si su resto no es 0, entrariamos directamente al else */
        if ((anio % 4 == 0 && 100 !=0) || (anio % 400 == 0)) {
            System.out.println(anio + " es bisiesto");
        } else {
            System.out.println(anio + " no es bisiesto");
        }
    }
}
