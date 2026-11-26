package Java.metodosArrays;
public class metodosArrays2 {
    public static void main(String[] args) {
        //Creamos el primerArray con los valores 1, 2 y 3
        int[] primerArray = {1, 2, 3};
        //Aqui lo que hacemos es llamar al metodo modificarArrays y lo deja modificado.
        modificarArrays(primerArray);
        //Y aqui lo que hacemos es volver a imprimir nuestro array esta vez modificado.
        imprimirElementos(primerArray);
        /*Creamos segundoArray y llamamos a el metodo obtenerArraysConElementosDuplicados con el valor que nos deja el
        el primer array despues de ser modiciado*/
        int [] segundoArray = obtenerArraysConElementosDuplicados(primerArray);
        //Imprimimos el primerArray ya modificado de antes
        imprimirElementos(primerArray);
        /*Imprimimos el segundoArray que como hemos llamado al metodo obtenerArraysConElementosDuplicados lo que ha hecho ha sido
        crear una copia de primerArray que habiamos modificado y la ha multiplicado por 2 sin cambiar el valor del primerArray*/
        imprimirElementos(segundoArray);
    }
    //En este metodo tenemos el arrays numeros sin valor y lo que hacemos con el bucle es que lea nuestro arrays.
    public static void imprimirElementos(int[] numeros) {
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
        
         System.out.println();
       
    }
    //Este metodo lo que haces es modificar el valor de nuestro array si tiene 1 o mas elementos dentros.
    public static void modificarArrays(int[] numeros){
        if(numeros.length >=1){
            numeros[0] = 100;
        }
    }
    /*En este metodo lo que hacemos es copiar el array que le asignemos creando uno nuevo que se llama copia.
    Lo que hace que ahora como vinieran los valores del array que le entregaramos al metodo, los guarda como nuevos y los
    multiplica por 2 los ultimos datos que le dieramos */
    public static int[] obtenerArraysConElementosDuplicados(int[] numeros){
        int[] copia = new int[numeros.length];
        for (int i = 0; i < copia.length; i++){
            copia[i] = numeros[i] * 2; 
        }
        //Retornamos el nuevo valor de nuestro array copia que es el responsable de que nos de el resultado nuevo.
        return copia;
    }
}
