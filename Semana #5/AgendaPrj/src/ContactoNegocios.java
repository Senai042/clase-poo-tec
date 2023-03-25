public class ContactoNegocios extends Contacto{
    private String email;

    public ContactoNegocios(String nombre, int edad, String direccion, String email) {
        super(nombre, edad, direccion);
        this.email = email;
    }

    @Override
    public String toString() {
        return "ContactoNegocios{" +
                "email='" + email + '\'' +
                "} " + super.toString();
    }
}
