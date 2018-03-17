package lab7.leonardobanegas;

import java.io.Serializable;
import java.util.ArrayList;

public class PC implements Serializable{
    private String direccionIP;
    private String mascara;
    private String gateaway;
    private ArrayList<Mensaje> mensajes = new ArrayList();

    public PC(String direccionIP, String mascara, String gateaway) {
        this.direccionIP = direccionIP;
        this.mascara = mascara;
        this.gateaway = gateaway;
    }

    public PC() {
    }

    public String getDireccionIP() {
        return direccionIP;
    }

    public void setDireccionIP(String direccionIP) {
        this.direccionIP = direccionIP;
    }

    public String getMascara() {
        return mascara;
    }

    public void setMascara(String mascara) {
        this.mascara = mascara;
    }

    public String getGateaway() {
        return gateaway;
    }

    public void setGateaway(String gateaway) {
        this.gateaway = gateaway;
    }

    public ArrayList<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    @Override
    public String toString() {
        return "PC{" + "direccionIP=" + direccionIP + ", mascara=" + mascara + ", gateaway=" + gateaway + ", mensajes=" + mensajes + '}';
    }
    
}
