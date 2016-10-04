import java.io.BufferedReader
import java.io.FileReader
import java.io.IOException
import java.util.ArrayList
import java.util.Scanner
import scala.collection.JavaConversions._

object Main {

  def main(args: Array[String]) {
    var contador = 0
    var linea = ""
    val br = new BufferedReader(new FileReader("C:\\Users\\JorgeAndres\\Desktop\\pacientes.txt"))
    val reader = new Scanner(System.in)
    println("Ingrese la implementacion que desea usar(BB o JFC): ")
    val opc = reader.nextLine()
    if (opc.equalsIgnoreCase("bb")) {
      val creadorpB = productfactory.debb()
      val vectorHeap = creadorpB.crearpriorityqueueb()
      while ((linea = br.readLine()) != null) {
        val ar = linea.split(", ")
        vectorHeap.add(new Paciente(ar(0), ar(1), ar(2)))
        contador += 1
      }
      br.close()
      val miarray = new ArrayList[Paciente]()
      var i = 0
      while (i != contador) {
        miarray.add(vectorHeap.remove())
        i += 1
      }
      for (i <- miarray) {
        println(i.toString)
      }
    } else if (opc.equalsIgnoreCase("jfc")) {
      val creadorp = productfactory.dejfc()
      val vectorHeap = creadorp.crearpriorityqueue()
      while ((linea = br.readLine()) != null) {
        val ar = linea.split(", ")
        vectorHeap.add(new Paciente(ar(0), ar(1), ar(2)))
        contador += 1
      }
      val miarray = new ArrayList[Paciente]()
      var i = 0
      while (i != contador) {
        miarray.add(vectorHeap.remove())
        i += 1
      }
      for (i <- miarray) {
        println(i.toString)
      }
    }
  }
}
