package Caso_5;
import java.util.ArrayList;

public class GestorEstudiantes {
	
	private ArrayList<String> lista = new ArrayList<>();

    public void agregar(String nombre) throws Exception {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new Exception("El nombre no puede estar vacío.");
        }
        if (nombre.trim().matches(".*\\d.*")) {
            throw new Exception("El nombre no puede contener números.");
        }
        if (nombre.trim().length() < 3) {
            throw new Exception("El nombre debe tener al menos 3 caracteres.");
        }
        lista.add(nombre.trim());
    }

    public void mostrarLista() {
        if (lista.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }
        System.out.println("\n--- LISTA DE ESTUDIANTES ---");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i + 1) + ". " + lista.get(i));
        }
        System.out.println("Total: " + lista.size() + " estudiante(s)");
    }

    public int total() {
        return lista.size();
    }
}


