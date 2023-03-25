import java.util.LinkedList;

public class Agenda {
    private LinkedList<Contacto> laAgenda;

    public Agenda() {
        this.laAgenda = new LinkedList<Contacto>();
    }

    public void agregarContacto(Contacto c){
        this.laAgenda.add(c);
    }

    public void imprimirAgenda(){
        for (Contacto c: this.laAgenda) {
            System.out.println(c);
        }
    }
}
