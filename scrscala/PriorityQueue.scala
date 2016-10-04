//remove if not needed
import scala.collection.JavaConversions._

trait PriorityQueue[E <: Comparable[E]] {

  def add(value: E): Unit

  def clear(): Unit

  def getFirst(): E

  def isEmpty(): Boolean

  def remove(): E

  def size(): Int
}
