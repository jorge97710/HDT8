import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase principal,
 * 
 * @author Eric Mendoza 15002
 * @author Jorge Azmitia 15202
 * @since 21/09/2016
 * @version 1.0
 */
public class Main {
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		int contador = 0;
		String linea = "";
		BufferedReader br = new BufferedReader(new FileReader(
				"C:\\Users\\JorgeAndres\\Desktop\\pacientes.txt"));

		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in); // Reading from System.in

		System.out
				.println("Ingrese la implementacion que desea usar(BB o JFC): ");

		String opc = reader.nextLine();

		if (opc.equalsIgnoreCase("bb")) {

			creadorpB creadorpB = productfactory.debb();
			VectorHeapb<Paciente> vectorHeap = creadorpB.crearpriorityqueueb();
			// VectorHeapb<Paciente> vectorHeapb = new VectorHeapb<Paciente>();
			while ((linea = br.readLine()) != null) {
				// Leer y guardar cada caso en priorityQueue
				String[] ar = linea.split(", ");
				vectorHeap.add(new Paciente(ar[0], ar[1], ar[2]));

				contador++;
			}
			br.close();

			ArrayList<Paciente> miarray = new ArrayList<Paciente>();
			for (int i = 0; i != contador; i++) {
				// System.out.println(vectorHeap.remove().toString());
				miarray.add(vectorHeap.remove());

			}

			for (Paciente i : miarray) {
				System.out.println(i.toString());

			}

		} else if (opc.equalsIgnoreCase("jfc")) {
			pfactory creadorp = productfactory.dejfc();
			VectorHeap<Paciente> vectorHeap = creadorp.crearpriorityqueue();
			while ((linea = br.readLine()) != null) {
				// Leer y guardar cada caso en priorityQueue
				String[] ar = linea.split(", ");
				vectorHeap.add(new Paciente(ar[0], ar[1], ar[2]));
				contador++;
			}
			ArrayList<Paciente> miarray = new ArrayList<Paciente>();
			for (int i = 0; i != contador; i++) {
				// System.out.println(vectorHeap.remove().toString());
				miarray.add(vectorHeap.remove());

			}

			for (Paciente i : miarray) {
				System.out.println(i.toString());

			}

		}

		// Leer archivo de texto

		// Crear nuevo VectorHeap
		// VectorHeapb<Paciente> vectorHeap = new VectorHeapb<Paciente>();

	}
}
