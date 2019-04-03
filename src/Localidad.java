public class Localidad {
    private int id;
    private String nombre;
    private Ciudad ciudad;

    public Localidad(int id, String nombre, Ciudad ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
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

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
}
