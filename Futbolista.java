 

public class Futbolista extends Persona {
    private Integer dorsal;
    private String demarcacion;

    public Futbolista() {
    }

    public Futbolista(Integer id, String nombre, String apellidos, Integer edad, Integer dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public Integer getDorsal() {
        return dorsal;
    }

    public void setDorsal(Integer dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public void jugarPartido() {
        System.out.println("El futbolista " + getNombre() + " está jugando el partido.");
    }

    public void entrenar() {
        System.out.println("El futbolista " + getNombre() + " está entrenando.");
    }

    @Override
    public void Concentrarse() {
        System.out.println("El futbolista " + getNombre() + " se está concentrando en el juego.");
    }

    @Override
    public void Viajar() {
        System.out.println("El futbolista " + getNombre() + " está viajando con el equipo.");
    }
    
}
