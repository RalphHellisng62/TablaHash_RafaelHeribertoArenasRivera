import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

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

         // Aqui mostrara el HashMap sin ordenar
        System.out.println("Datos originales en la tabla Hash:");
        for (Map.Entry<Integer, String> entry : tablaHash.entrySet()) {
            System.out.println("ID " + entry.getKey() + ": " + entry.getValue());
        }
        
        // Y ordenara los valores de la HashTable
        ArrayList<String> listaOrdenada = new ArrayList<>(tablaHash.values());
        Collections.sort(listaOrdenada);
        
        // Y por ultimo mostrara los resultados ordenados
        System.out.println("\n Datos ordenados alfabéticamente:");
        for (String nombre : listaOrdenada) {
            System.out.println(nombre);
        }
    }
}
