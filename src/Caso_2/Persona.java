package Caso_2;

public class Persona {
	//MIS ATRIBUTOS      
    private String nombre;
    private int edad;

    //MIS CONSTRUCTORES
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    //MUESTRO INFORMACION DE PERSONA
    public void mostrarDatos() {
        System.out.println("Nombre: " + this.nombre + " | Edad: " + this.edad + " años.");
    }
}