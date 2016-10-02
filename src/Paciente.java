/**
 * Clase principal,
 * @author Eric Mendoza 15002
 * @author Horge Azmithia 15
 * @since 21/09/2016
 * @version 1.0
 */
public class Paciente implements Comparable<Paciente>{

    private String nombre, situacion, prioridad;

    public Paciente(String nombre, String situacion, String prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.situacion = situacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getSituacion() {
        return situacion;
    }

    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }

    /**
     * @param o the object to be compared.
     * @return a negative integer, zero, or a positive integer as this object
     * is less than, equal to, or greater than the specified object.
     * @throws NullPointerException if the specified object is null
     * @throws ClassCastException   if the specified object's type prevents it
     *                              from being compared to this object.
     */
    @Override
    public int compareTo(Paciente o) {
        String prioridad1, prioridad2;

        // Obtener prioridad de ambos pacientes y compararlos lexicograficamente
        prioridad1 = getPrioridad().toLowerCase();
        prioridad2 = o.getPrioridad().toLowerCase();

        // Devuelve mayor a cero si es mayor, 0 si son iguales y menor a cero si son menores
        return prioridad1.compareTo(prioridad2);
    }

    @Override
    public String toString() {
        return "Paciente: " + nombre + ", " + situacion +  ", " + prioridad;
    }
}
