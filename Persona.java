public class Persona {
    private Integer Id;
    private String Nombre;
    private String Apellidos;
    private Integer Edad;

    public Persona() {
    }

    public Persona(Integer id, String nombre, String apellidos, Integer edad) {
        Id = id;
        Nombre = nombre;
        Apellidos = apellidos;
        Edad = edad;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer edad) {
        Edad = edad;
    }

    public void Concentrarse() {
        System.out.println("Concentrandose");

    }

    public void Viajar() {
        System.out.println("Viajando");
    }

    
}