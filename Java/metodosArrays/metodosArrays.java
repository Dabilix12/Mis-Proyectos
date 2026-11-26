package Java.metodosArrays;

public class metodosArrays {
    public static void main(String[] args) {
        //Creamos un arrays que se llama miArray el cual va a coger los datos de obtenerArrays
        int[] miArray = obtenerArrays();

        //Este bucle lee nuestro array
        for (int i = 0; i < miArray.length; i++){
            System.out.println(miArray[i]);
        }
    }
    /*Creamos el metodo int[] (es un array) y le llamamos obtenerArrays(), eso hace que cogamos los datos del array
     de public static int[] y lo podamos meter en nuestra clase main.*/
    public static int[] obtenerArrays(){
        //Creamos un array llamado numeros el cual guarda los valores 1, 2 y 3.
        int[] numeros = {1, 2, 3};
        //el returm siver para que cuando llamemos al metodo (obtenerArrays) salga el valor de el array numeros.
        return  numeros;
    }
}
