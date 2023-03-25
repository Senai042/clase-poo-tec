import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Agenda laAgenda = new Agenda();

        laAgenda.agregarContacto(new ContactoFamiliar("Oscar",44,"la casa","A+"));
        laAgenda.agregarContacto(new ContactoNegocios("María",25,"la otra casa","maria@correo.com"));

        laAgenda.imprimirAgenda();

    }
}