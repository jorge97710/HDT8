/**
 * Clase para seleccionar la implementeacion de PriorityQueue
 *
 * @author Eric Mendoza 15002
 * @author Jorge Azmitia 15202
 * @since 21/09/2016
 * @version 1.0
 */
public class creadorp implements pfactory {

	/* (non-Javadoc)
	 * @see pfactory#crearpriorityqueue()
	 */
	@Override
	public VectorHeap<Paciente> crearpriorityqueue() {
		return new VectorHeap<Paciente>();
	}

}
