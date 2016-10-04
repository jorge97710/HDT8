import java.util.PriorityQueue
import java.util.Vector
import VectorHeap._
//remove if not needed
import scala.collection.JavaConversions._

object VectorHeap {

  protected def left(i: Int): Int = 2 * i + 1

  protected def parent(i: Int): Int = (i - 1) / 2

  protected def right(i: Int): Int = (2 * i + 1) + 1
}

@SerialVersionUID(1L)
class VectorHeap[E <: Comparable[E]] extends PriorityQueue[Any] {

  protected var data: Vector[E] = new Vector[E]()

  def this(v: Vector[E]) {
    this()
    var i: Int = 0
    data = new Vector[E](v.size)
    i = 0
    while (i < v.size) {
      add(v.get(i))
      i += 1
    }
  }

  def add(value: E) {
    data.add(value)
    percolateUp(data.size - 1)
  }

  def clear() {
    data.clear()
  }

  def getFirst(): E = data.elementAt(0)

  def isEmpty(): Boolean = data.size == 0

  protected def percolateUp(leaf: Int) {
    val parent = parent(leaf)
    val value = data.get(leaf)
    while (leaf > 0 && (value.compareTo(data.get(parent)) < 0)) {
      data.set(leaf, data.get(parent))
      val leaf = parent
      parent = parent(leaf)
    }
    data.set(leaf, value)
  }

  protected def pushDownRoot(root: Int) {
    val heapSize = data.size
    val value = data.get(root)
    while (root < heapSize) {
      var childpos = left(root)
      if (childpos < heapSize) {
        if ((right(root) < heapSize) && 
          ((data.get(childpos + 1)).compareTo(data.get(childpos)) < 
          0)) {
          childpos += 1
        }
        if ((data.get(childpos)).compareTo(value) < 0) {
          data.set(root, data.get(childpos))
         val  root = childpos
        } else {
          data.set(root, value)
          return
        }
      } else {
        data.set(root, value)
        return
      }
    }
  }

  def remove(): E = {
    val minVal = getFirst
    data.set(0, data.get(data.size - 1))
    data.setSize(data.size - 1)
    if (data.size > 1) pushDownRoot(0)
    minVal
  }

  def size(): Int = data.size

  override def toString(): String = ""
}
