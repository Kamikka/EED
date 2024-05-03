package proyectoEED;

public class Alumno {

	
	//En esta clase en general podemos aplicar la norma de Open 
	//for extension, closed for modification ya que si fuera necesario
	//ampliarla se podría hacer sin tener que cambiar ninguna de las cosas 
	//que están ya instanciadas en la misma. Esto nos ayuda permitiendo
	//que la aplicación escale de una manera mas sencilla y eficaz. 
	 private String nombre;
	    private String leHanQuitadoMovil;

	    public Alumno(String nombre, String leHanQuitadoMovil) {
	        this.nombre = nombre;
	        this.leHanQuitadoMovil = leHanQuitadoMovil;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public String isLeHanQuitadoMovil() {
	        return leHanQuitadoMovil;
	    }

	    public void setLeHanQuitadoMovil(String leHanQuitadoMovil) {
	        this.leHanQuitadoMovil = leHanQuitadoMovil;
	    }
}
