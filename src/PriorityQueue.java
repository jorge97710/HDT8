/**
 * Clase de Priority Queue que se proporcionó desde blackboard
 *
 * @author Eric Mendoza 15002
 * @author Jorge Azmitia 15202
 * @since 30/09/2016
 * @version 1.0
 */
public interface PriorityQueue<E extends Comparable<E>> {
	public void add(E value);

	// pre: !isEmpty()
	// post: returns the minimum value in priority queue

	/**
	 * 
	 */
	public void clear();

	// post: removes all elements from queue

	// pre: !isEmpty()
	// post: returns and removes minimum value from queue

	/**
	 * @return
	 */
	public E getFirst();

	// pre: value is non-null comparable
	// post: value is added to priority queue

	/**
	 * @return
	 */
	public boolean isEmpty();

	// post: returns true iff no elements are in queue

	/**
	 * @return
	 */
	public E remove();

	// post: returns number of elements within queue

	/**
	 * @return
	 */
	public int size();
}