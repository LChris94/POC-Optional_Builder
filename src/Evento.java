public class Evento {
    private int id;
    private String nombre;
    private Localidad localidad;

    public Evento(int id, String nombre, Localidad localidad) {
        this.id = id;
        this.nombre = nombre;
        this.localidad = localidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", localidad=" + localidad +
                '}';
    }
}
