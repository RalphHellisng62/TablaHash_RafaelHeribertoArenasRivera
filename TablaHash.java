import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class TablaHash {
    // Empezamos con la construcción de un main
    public static void main(String[] args) {
        // nombre del arcihvo
        String archivo = "nombresTablaHash.txt";
        
        // Esto sera la tabla hash para almacenar los nombres
        HashMap<Integer, String> tablaHash = new HashMap<>();

        // Aqui lee el archivo y cargara los nombres al HashMap
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            int id = 1;
            
            while ((linea = br.readLine()) != null) {
                tablaHash.put(id, linea.trim());
                id++;
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            return;
        }
        
    }
}
