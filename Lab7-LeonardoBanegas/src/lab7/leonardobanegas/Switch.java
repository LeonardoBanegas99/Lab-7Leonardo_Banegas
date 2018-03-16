package lab7.leonardobanegas;

import java.util.ArrayList;

public class Switch {
    private String nombre;
    private int velocidadtransmision;
    private int velocidadderecepcion;
    private Router router;
    private ArrayList<PC> pcs = new ArrayList();

    public Switch(String nombre, int velocidadtransmision, int velocidadderecepcion) {
        this.nombre = nombre;
        this.velocidadtransmision = velocidadtransmision;
        this.velocidadderecepcion = velocidadderecepcion;
    }

    public Switch() {
    }

    public Switch(String nombre, int velocidadtransmision, int velocidadderecepcion, Router router) {
        this.nombre = nombre;
        this.velocidadtransmision = velocidadtransmision;
        this.velocidadderecepcion = velocidadderecepcion;
        this.router = router;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVelocidadtransmision() {
        return velocidadtransmision;
    }

    public void setVelocidadtransmision(int velocidadtransmision) {
        this.velocidadtransmision = velocidadtransmision;
    }

    public int getVelocidadderecepcion() {
        return velocidadderecepcion;
    }

    public void setVelocidadderecepcion(int velocidadderecepcion) {
        this.velocidadderecepcion = velocidadderecepcion;
    }

    public Router getRouter() {
        return router;
    }

    public void setRouter(Router router) {
        this.router = router;
    }

    public ArrayList<PC> getPcs() {
        return pcs;
    }

    public void setPcs(ArrayList<PC> pcs) {
        this.pcs = pcs;
    }

    @Override
    public String toString() {
        return "Switch{" + "nombre=" + nombre + ", velocidadtransmision=" + velocidadtransmision + ", velocidadderecepcion=" + velocidadderecepcion + ", router=" + router + ", pcs=" + pcs + '}';
    }
    
    
    
}
