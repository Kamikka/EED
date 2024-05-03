package proyectoEED;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionListaAlumnos {

	 private static ArrayList<Alumno> listaAlumnos = new ArrayList<>();

	 	//En todo el código podemos encontrar la norma KISS(Keep It Simple Stupid)
	 	//en el momento en que no se dificulta la legibilidad del código en ningún 
	 	//caso y se intenta mantener simple y legible. Esto ayuda a la hora de realizar
	 	//cualquier acción sobre el código ya que es más fácil ver y operar con los elementos
	 	//del mismo 
	 
	 
	 	//En el código contamos con la norma YAGNI (You Ain’t Gonna Need It) en el momento 
	 	//en que no tenemos ninguna porción de código no necesaria o que no realize ninguna tarea. 
	 	//Esto nos ayuda a la hora de conseguir que el código sea menos extenso y por lo tanto
	 	//mas manejable y cómodo a la hora de operar en el.
	 
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        boolean continuar = true;

	        while (continuar) {
	            System.out.println("1. Agregar alumno");
	            System.out.println("2. Eliminar alumno");
	            System.out.println("3. Mostrar lista de alumnos");
	            System.out.println("4. Salir");
	            System.out.print("Seleccione una opción: ");
	            int opcion = scanner.nextInt();

	            switch (opcion) {
	                case 1:
	                	//Aqui podemos encontrar la norma de aplicar nombres significativos
	                	//ya que agregarAlumno es sugerente y se puede intuir bien la función
	                	//que cumple. Esta norma quita el trabajo de tener que buscar que hace
	                	//cada función
	                    agregarAlumno();
	                    break;
	                case 2:
	                    eliminarAlumno();
	                    break;
	                case 3:
	                    mostrarListaAlumnos();
	                    break;
	                case 4:
	                    continuar = false;
	                    System.out.println("Saliendo de la aplicación, bye...");
	                    break;
	                //El código también trata los posibles errores que se puedan dar a la hora de interaccionar 
	                //con el usuario. Esto nos ayuda evitando que el código explote y dándole al usuario 
	                //un aviso claro de lo que esta sucediendo para que así pueda evitar la conducta errónea 
	                default:
	                    System.out.println("Opción no registrada. Por favor, seleccione alguna de las mostradas por pantalla");
	            }
	        }
	        scanner.close();
	    }
	    
	    //Como podemos observar aqui se da la norma (DRY Don't Repeat Yourself)
	    //ya que al usar funciones que aplicamos en el programa evitamos tener que
	    //reescribir el código cada vez que queremos realizar esta accion. Esta norma
	    //nos beneficia a la hora de hacer el código menos extenso y a la hora de ahorrar tiempo
	    private static void agregarAlumno() {
	    	//En este punto podemos encontrar el principio de última sorpresa
	    	//ya que el código es predecible junto al nombre de la función. 
	    	//Esta norma nos permite operar con seguridad de que no encotraremos
	    	//ninguna sorpresa a lo largo del funcionamiento del código
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Ingrese el nombre del alumno: ");
	        String nombre = sc.nextLine();
	        System.out.print("¿Se le ha quitado el movil?(Si/No)");
	        String leHanQuitadoMovil = sc.nextLine();
	        listaAlumnos.add(new Alumno(nombre, leHanQuitadoMovil));
	        System.out.println("Alumno agregado correctamente.");
	    }

	    private static void eliminarAlumno() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Ingrese el nombre del alumno que desea eliminar: ");
	        String nombre = sc.nextLine();
	        boolean encontrado = false;
	        for (int i = 0; i < listaAlumnos.size(); i++) {
	            if (listaAlumnos.get(i).getNombre().equals(nombre)) {
	                listaAlumnos.remove(i);
	                System.out.println("Alumno eliminado correctamente.");
	                encontrado = true;
	                break;
	            }
	        }
	        if (!encontrado) {
	            System.out.println("El alumno no se encuentra en la lista.");
	        }
	    }

	    //Aqui y en el resto de funciones podemos encontrar el principio de responsabilidad única
	    //dado que cada función cumple una tarea específica sin depender de lo que las demas hagan. 
	    //Esto nos ayuda ya que el código queda mas claro, y en caso de error podemos dar con el 
	    //núcleo del problema de manera concisa
	    private static void mostrarListaAlumnos() {
	        System.out.println("Lista de alumnos:");
	        for (Alumno alumno : listaAlumnos) {
	            System.out.println("Nombre: " + alumno.getNombre() + ", ¿Se le ha quitado el móvil?: " + alumno.isLeHanQuitadoMovil());
	        }
	    }
}
