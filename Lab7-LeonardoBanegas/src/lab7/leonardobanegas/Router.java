package lab7.leonardobanegas;

import java.io.Serializable;
import java.util.ArrayList;

public class Router implements Serializable{
    private String direccionIP;
    private String mascara;
    private Switch switchconec;
    private String protocolo;
    private int velocidaddetrans;
    private int velocidadderecep;
    private ArrayList<Router> routerconec = new ArrayList();

    public Router(String direccionIP, String mascara, String protocolo, int velocidaddetrans, int velocidadderecep) {
        this.direccionIP = direccionIP;
        this.mascara = mascara;
        this.protocolo = protocolo;
        this.velocidaddetrans = velocidaddetrans;
        this.velocidadderecep = velocidadderecep;
    }

    public Router() {
    }

    public Router(String direccionIP, String mascara, Switch switchconec, String protocolo, int velocidaddetrans, int velocidadderecep) {
        this.direccionIP = direccionIP;
        this.mascara = mascara;
        this.switchconec = switchconec;
        this.protocolo = protocolo;
        this.velocidaddetrans = velocidaddetrans;
        this.velocidadderecep = velocidadderecep;
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

    public Switch getSwitchconec() {
        return switchconec;
    }

    public void setSwitchconec(Switch switchconec) {
        this.switchconec = switchconec;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public int getVelocidaddetrans() {
        return velocidaddetrans;
    }

    public void setVelocidaddetrans(int velocidaddetrans) {
        this.velocidaddetrans = velocidaddetrans;
    }

    public int getVelocidadderecep() {
        return velocidadderecep;
    }

    public void setVelocidadderecep(int velocidadderecep) {
        this.velocidadderecep = velocidadderecep;
    }

    public ArrayList<Router> getRouterconec() {
        return routerconec;
    }

    public void setRouterconec(ArrayList<Router> routerconec) {
        this.routerconec = routerconec;
    }

    @Override
    public String toString() {
        return "Router{" + "direccionIP=" + direccionIP + ", mascara=" + mascara + ", switchconec=" + switchconec + ", protocolo=" + protocolo + ", velocidaddetrans=" + velocidaddetrans + ", velocidadderecep=" + velocidadderecep + ", routerconec=" + routerconec + '}';
    }

    
    
}
