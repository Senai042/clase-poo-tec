public class Contacto {
    private Persona laPersona;
    private String direccion;

    public Contacto(Persona laPersona, String direccion) {
        this.laPersona = laPersona;
        this.direccion = direccion;
    }

    public Contacto(String nombre, int edad, String direccion){
        this.laPersona = new Persona(nombre,edad);
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "laPersona=" + laPersona +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
