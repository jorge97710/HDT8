import static org.junit.Assert.*;

import org.junit.Test;

public class VectorHeapTest {

	@Test
	public void testAddE() {
		VectorHeap<String> miv = new VectorHeap<String>();
		miv.add("");
	}

	@Test
	public void testRemove() {
		VectorHeap<String> miv = new VectorHeap<String>();
		String hola = "hola";
		miv.add(hola);
		assertEquals(hola, miv.remove());
	}

}
