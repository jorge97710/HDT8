import scala.reflect.{BeanProperty, BooleanBeanProperty}
import scala.reflect
import scala.collection.JavaConversions._

class Paciente(@BeanProperty var nombre: String, @BeanProperty var situacion: String, @BeanProperty var prioridad: String)
    extends Comparable[Paciente] {

  override def compareTo(o: Paciente): Int = {
    var prioridad1: String = null
    var prioridad2: String = null
    prioridad1 = getPrioridad.toLowerCase()
    prioridad2 = o.getPrioridad.toLowerCase()
    prioridad1.compareTo(prioridad2)
  }

  override def toString(): String = {
    "Paciente: " + nombre + ", " + situacion + ", " + prioridad
  }
}
