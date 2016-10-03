/**
 * Clase para seleccionar la implementeacion de PriorityQueue
 *
 * @author Eric Mendoza 15002
 * @author Jorge Azmitia 15202
 * @since 21/09/2016
 * @version 1.0
 */
public class creadorpB implements pbfactory {

	/* (non-Javadoc)
	 * @see pbfactory#crearpriorityqueueb()
	 */
	@Override
	public VectorHeapb<Paciente> crearpriorityqueueb() {
		return new VectorHeapb<Paciente>();
	}

}
