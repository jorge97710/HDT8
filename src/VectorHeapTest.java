import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Clase que prueba los metodos de VectorHeap
 *
 * @author Eric Mendoza 15002
 * @author Jorge Azmitia 15202
 * @since 21/09/2016
 * @version 1.0
 */

public class VectorHeapTest {

	@Test
    /**
     * Agrega un elemento, y luego verifica que este se haya agregado
     */
	public void testAddE() {
		VectorHeap<String> miv = new VectorHeap<String>();
		miv.add("A");
		assertEquals("A", miv.getFirst());

	}

	@Test
    /**
     * Agrega varios objetos en desorden, se asegura que el remove los elimine en orden
     */
	public void testRemove() {
		VectorHeap<String> miv = new VectorHeap<String>();
        miv.add("I");
        miv.add("D");
		miv.add("E");
		miv.add("C");
		miv.add("A");
		miv.add("I");
		assertEquals("A", miv.remove());
	}

}
