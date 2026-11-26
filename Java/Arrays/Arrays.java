package Java.Arrays;
public class Arrays {
    public static void main(String[] args) {
        //Creamos el primerArrays con los valores 1, 2 y 3, (El valor de los arrray va de 0 a 2, el 0 es el 1, y el 2 es el 3).
        int[] primerArrays = {1, 2, 3};
        //Aqui creamos el array segundoArrat el cual tiene el valor de primer array
        int[] segundoArrays = primerArrays;
        //Creamos un tercerArrays
        int[] tercerArrays= {4, 5, 6};
        
        //Cambiamos el valor del hueco 1 (2) del primerArray por el numero 20, ahora en vez de ser 1, 2 y 3, son 1, 20 y 3.
        primerArrays[1] = 2;

        System.out.println("Elementos de primerArrays");
        //primerArrays.length lee todo el arrays
        for (int i = 0; i < primerArrays.length; i++){
            System.out.println(primerArrays[i]);
        }

        //Salto de linea.
        System.out.println();

        System.out.println("Elementos del segundoArrays");
        for (int i = 0; i < segundoArrays.length; i++) {
            System.out.println(segundoArrays[i]);
        }

        //Salto de linea
        System.out.println();

        System.out.println("Elementos del tercerArrays");
        /*Añadimos un tercerArrays para que se vea que el primerArrays y el segundoArrays tienen el mismo espacio asiganado en la ram ya que el segundoArrays
         tiene el valor de el primerArrays, y todo lo que se cambie en primerArrays sera guardado tambien en el segundoArrays.*/
        for (int i = 0; i< tercerArrays.length; i++){
            System.out.println(tercerArrays[i]);
        }
    }
}
