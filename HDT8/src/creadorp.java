public class creadorp implements pfactory {

	/* (non-Javadoc)
	 * @see pfactory#crearpriorityqueue()
	 */
	@Override
	public VectorHeap<Paciente> crearpriorityqueue() {
		return new VectorHeap<Paciente>();
	}

}
