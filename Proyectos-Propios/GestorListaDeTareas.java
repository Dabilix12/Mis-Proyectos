/*Este proyecto ha sido creado extra escolarmente para llevar a cabo las herramientas
  aprendidas sobre java y hacer programas que se asemejen a la vida cotidiana, con lo cual
  cualquier idea para optimizar o mejorar el codigo es bienvenida.
  Tambien añadir que los comentarios estan hechos por mi segun iba encontrando errores e investigando 
  como solucionarlos, digo lo mismo que con el codigo, todo lo que sea optimizarlo
  y mejorarlo es siempre bienvenido. */

//Importamos la libreria Scanner para poder obtener los datos del usuario.
import java.util.Scanner;
//Importamos al libreria ArrayList para poder usar arraylist en nuestro programa y poder guardar la información añadida por el usuario mientras el programa siga en ejecución.
import java.util.ArrayList;
public class GestorListaDeTareas {    
    public static void main(String[] args) {
        //Abreviamos la herramienta Scanner para que sea mas sencilla y practica de usar.
        Scanner sc = new Scanner(System.in);
        //Creamos nuestro ArrayList fuera del bucle para que no se borre, ya que aquí donde se guardaran los datos del usuario.
        ArrayList<String> tarea = new ArrayList<>();
        //Creamos la variable opcion con la cual podremos ir pasando por el swich segun el usuario vaya indicando.
        int opcion;
        
        //Iniciamos el bucle do/While que nos servira para poder ir pasando de tarea en tarea en el switch sin que se termine el programa.
        do {
        System.out.println("\n--- Mi lista de tareas ---");
        System.out.println("1. Añadir una tarea nueva que hacer.");
        System.out.println("2. Ver tareas pendientes.");
        System.out.println("3. Eliminar tarea completada.");
        System.out.println("0 Salir.");
        System.out.println("Elija una opción");
        //Guardamos la variable opcion que nos ha indicado el usuario.
        opcion = sc.nextInt();
        //Metemos este sc.nextLine para que limpie el nextInt() en la memoria.
        sc.nextLine();
        
        //Le damos el valor opcion al switch y creamos las diferentes case a medida de la opcion que elija el usuario.
        switch (opcion) {
            //En este case lo que hacemos es añadir la tarea que el usuario nos introduzca gracuas al sc.nextLine y al tarea.add
            case 1:
                System.out.print("Que tarea desea añadir: ");
                String nuevaTarea = sc.nextLine();
                //Metemos el dato introducido el usuario al finla de la lista
                tarea.add(nuevaTarea);
                System.out.println("Tarea guardada");
                //Terminamos el proceso y volvemos al menu.
                break;
            case 2:
                System.out.println("Estas son tus tareas: ");
                //Este for lee nuestro arrayList gracias a size
                for (int i = 0; i < tarea.size(); i++){
                    //Aquí al poner tarea.get saca la tarea 1 ya que el usuario lee 1, 2, 3 y java lo lee 0, 1, 2.
                    System.out.println((i + 1) + ". " + tarea.get(i));
                }
                break;
            case 3:
                //Pedimos al usuario que eliga el numero de la tarea que quiera eliminar por que ya la ha comletado
                System.out.println("¿Que número de tarea completada quiere eliminar? (el numero sale al principio del nombre de la tarea)");
                int numero = sc.nextInt();
                //Para limpiar el enter del nextInt();
                sc.nextLine();
                //Tarea.remove elimina la tarea seleccionada gracias al -1, ya que el usuario cuenta 1, 2, 3 y java cuenta, 0, 1, 2.
                tarea.remove(numero -1);
                System.out.println("Tarea completada eliminada");
                break;
            //Finaliza el programa.
            case 0:
                System.out.println("Cerrando gestor de tareas...");
                break;
            default:
                System.out.println("Opcion no valida.");
            }
            //Este if sirve para dejar el menu limpio y poder ver todo mejor.
            if (opcion != 0) {
                System.out.println("\nPulsa ENTER para volver al menú...");
                sc.nextLine();
            }
        } while (opcion != 0);
    }
}
