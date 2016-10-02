public class creadorpB implements pbfactory {

	/* (non-Javadoc)
	 * @see pbfactory#crearpriorityqueueb()
	 */
	@Override
	public VectorHeapb<Paciente> crearpriorityqueueb() {
		return new VectorHeapb<Paciente>();
	}

}
