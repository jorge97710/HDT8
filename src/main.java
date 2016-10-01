/**
 * Clase principal,
 * @author Eric Mendoza 15002
 * @author Horge Azmithia 15
 * @since 21/09/2016
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {

        // Tomar en cuenta que cuando se compara, la de mayor prioridad es menor
        // osea, mira este ejemplo que deje, A<C, osea, la mas importante es la menor
        Paciente p1 = new Paciente("Eric", "Pierna doblada", "A");
        Paciente p2 = new Paciente("Eric", "Pierna rota", "C");
        Paciente p3 = new Paciente("Eric", "Pierna rota", "E");
        Paciente p4 = new Paciente("Eric", "Pierna floja", "B");


        System.out.println(p1.compareTo(p3));



    }
}
