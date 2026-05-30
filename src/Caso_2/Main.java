package Caso_2;

public class Main {
//REALIZADO POR LUIS ORTIZ
    public static void main(String[] args) {	        
        //OBJ_1
        Persona p1 = new Persona("Juan Perez", 30);	                
        //OBJ_2
        Persona p2 = new Persona("Rosa Alvarez", 22);	                
        //MUESTRO MI INFORMACION DE CADA PERSONA
        System.out.println("--- Datos De Las Personas ---");
        p1.mostrarDatos();
        p2.mostrarDatos();
    }
}