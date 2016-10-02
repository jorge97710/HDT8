import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * Clase principal,
 * @author Eric Mendoza 15002
 * @author Horge Azmithia 15
 * @since 21/09/2016
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // Leer archivo de texto
        BufferedReader br = new BufferedReader(new FileReader("pacientes.txt"));

        // Crear nuevo VectorHeap
        VectorHeap<Paciente> vectorHeap = new VectorHeap<Paciente>();

        String linea;
        while((linea = br.readLine()) != null)
        {
            // Leer y guardar cada caso en priorityQueue
            String[] ar = linea.split(", ");
            vectorHeap.add(new Paciente(ar[0], ar[1], ar[2]));
        }
        br.close();

        System.out.println(vectorHeap.remove().toString());
        System.out.println(vectorHeap.remove().toString());
        System.out.println(vectorHeap.remove().toString());
        System.out.println(vectorHeap.remove().toString());

    }
}
