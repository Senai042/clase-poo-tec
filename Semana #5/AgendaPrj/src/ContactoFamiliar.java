public class ContactoFamiliar extends Contacto{
    private String tipoSangre;

    public ContactoFamiliar(String nombre, int edad, String direccion, String tipoSangre) {
        super(nombre, edad, direccion);
        this.tipoSangre = tipoSangre;
    }

    @Override
    public String toString() {
        return "ContactoFamiliar{" +
                "tipoSangre='" + tipoSangre + '\'' +
                "} " + super.toString();
    }
}
