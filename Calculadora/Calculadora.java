/*Objetivo de la practica:
Calculadora de IVA. Pide por teclado el precio de un producto sin IVA y calcula su precio final sumándole el 21%. 
Formatea el resultado a dos decimales. 

Con este ejercicio buscamos usar la libreria Scanner y crear condiciones para poder hacer los calculos del IVA.*/

//Nombre de nuestra carpeta, tambien conocidad como paquete.
package Calculadora;
//importamos la libreria Scanner para poder leer los datos que nos da el usuario.
import java.util.Scanner;

//Nombre de nuestro archivo .java
public class Calculadora {
    //Clase main para que funcione nuestro programa.
    public static void main(String[] args) {
        //Aquí vamos a abrebiar nuestra herramienta Scanner.
        Scanner sc = new Scanner(System.in);
        
        //Ahora le vamos a pedir al usuario que nos de el precio de su prodcuto sin iva para aplicarle el 21% de iva.
        System.out.println("Por favor, introduzca el precio de su producto sin iva: ");
        
        //Creamos al variable productoSinIva y le ponemos "sc.nextDouble()" para que guarde el dato que le hemos dado. (La guardamos como double por si el producto tiene decimales).
        double prodcutoSinIva = sc.nextDouble();

        //Ahora vamos a crear la variable iva la cual va a ser el resultado de nuestro productoSinIva * 0.21 que seria el 21%.
        double iva = prodcutoSinIva * 0.21;

        //Ahora vamos a crear la variable productoConIva la cual va a ser el resulado de la suma de nuestro productoSinIva + el iva.
        double productoConIva = prodcutoSinIva + iva;

        //Ahora una vez tengamos la variable productoConIva, vamos a decirle al usuario cuanto seria el 21% de iva de su producto.
        System.out.println("El 21% de tu producto es: " + iva);

        //Y acontinuación le imprimimos el precio de su producto con el 21% de iva ya incluido.
        System.out.println("Tu producto con el 21% de iva incluido seria: " + productoConIva);
        
        //Al poner este codigo, lo que hacemos es decirle al codigo que ya no vamos a usar mas la istancia Scanner.
        sc.close();
    }
}
