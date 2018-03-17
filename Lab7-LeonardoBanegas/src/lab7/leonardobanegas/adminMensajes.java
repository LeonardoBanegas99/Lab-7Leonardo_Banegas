package lab7.leonardobanegas;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class adminMensajes extends Thread {

    private Mensaje mensaje;
    private JTable tabla;
    private JTable tabla2;
    private boolean avanzar;
    private boolean vive;
    private Switch switch1;
    private Switch switch2;
    private int switchoriginal;

    public adminMensajes(Mensaje mensaje, JTable tabla, JTable tabla2) {
        this.mensaje = mensaje;
        this.tabla = tabla;
        this.tabla2 = tabla2;
        avanzar = true;
        vive = true;
    }

    public adminMensajes(Switch switch1, Switch switch2, int switchoriginal) {
        this.switch1 = switch1;
        this.switch2 = switch2;
        this.switchoriginal = switchoriginal;
    }

    public Mensaje getMensaje() {
        return mensaje;
    }

    public void setMensaje(Mensaje mensaje) {
        this.mensaje = mensaje;
    }

    public Switch getSwitch1() {
        return switch1;
    }

    public void setSwitch1(Switch switch1) {
        this.switch1 = switch1;
    }

    public Switch getSwitch2() {
        return switch2;
    }

    public void setSwitch2(Switch switch2) {
        this.switch2 = switch2;
    }

    public int getSwitchoriginal() {
        return switchoriginal;
    }

    public void setSwitchoriginal(int switchoriginal) {
        this.switchoriginal = switchoriginal;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        DefaultTableModel modelo2 = (DefaultTableModel) tabla2.getModel();
        String IPOrigen = mensaje.getDirIPorigen();
        String IPDestino = mensaje.getDirIPdestino();

        PC compufinal = null;
        int ver = 0;

        if (switchoriginal == 1) {
            for (PC compu : switch2.getPcs()) {
                if (compu.getDireccionIP().equals(IPDestino)) {
                    compufinal = compu;
                    ver = 1;
                }
            }
        } else if (switchoriginal == 2) {
            for (PC compu : switch1.getPcs()) {
                if (compu.getDireccionIP().equals(IPDestino)) {
                    compufinal = compu;
                    ver = 2;
                }
            }
        }
        if (switchoriginal == 1) {
            for (PC compu : switch1.getPcs()) {
                if (compu.getDireccionIP().equals(IPDestino)) {
                    System.out.println("gay5");
                    compufinal = compu;
                    ver = 3;
                }
            }
        } else if (switchoriginal == 2) {
            for (PC compu : switch2.getPcs()) {
                if (compu.getDireccionIP().equals(IPDestino)) {
                    compufinal = compu;
                    ver = 4;
                }
            }
        }
//****************************************************
        if (ver == 1) {
            System.out.println("gayver1");
            try {
                Thread.sleep(switch1.getVelocidadderecepcion() * 1000);
            } catch (InterruptedException e) {
            }
            Object[] newrow = {mensaje.getTitulo(), switch1.getNombre(), switch1.getVelocidadderecepcion(), "Entregado"};
            modelo.addRow(newrow);
            tabla.setModel(modelo);
            try {
                Thread.sleep(switch1.getVelocidadtransmision() * 1000);
            } catch (InterruptedException e) {
            }
            Object[] newrow2 = {mensaje.getTitulo(), "Router con IP: " + switch1.getRouter().getDireccionIP(), switch1.getVelocidadtransmision(), "Entregado"};
            modelo.addRow(newrow2);
            tabla.setModel(modelo);
            try {
                Thread.sleep(switch2.getRouter().getVelocidadderecep() * 1000);
            } catch (InterruptedException e) {
            }
            Object[] newrow3 = {mensaje.getTitulo(), "Router con IP: " + switch2.getRouter().getDireccionIP(), switch2.getRouter().getVelocidadderecep(), "Entregado"};
            modelo.addRow(newrow3);
            tabla.setModel(modelo);
            try {
                Thread.sleep(switch2.getRouter().getVelocidaddetrans() * 1000);
            } catch (InterruptedException e) {
            }
            Object[] newrow4 = {mensaje.getTitulo(), switch2.getNombre(), (switch2.getRouter().getVelocidaddetrans()), "Entregado"};
            modelo.addRow(newrow4);
            tabla.setModel(modelo);

            try {
                Thread.sleep(switch2.getVelocidadtransmision() * 1000);
            } catch (InterruptedException e) {
            }
            for (PC p : switch2.getPcs()) {
                if (p.getDireccionIP().equalsIgnoreCase(IPDestino)) {
                    System.out.println("4");
                    Object[] newrow5 = {mensaje.getTitulo(), "PC con IP: " + IPDestino, switch2.getVelocidadtransmision(), "Entregado"};
                    modelo.addRow(newrow5);
                    tabla.setModel(modelo);
                }
            }
//***********************************************************
        } else if (ver == 2) {
            System.out.println("gayver2");
            try {
                Thread.sleep(switch2.getVelocidadderecepcion() * 1000);
            } catch (InterruptedException e) {
            }
            Object[] newrow = {mensaje.getTitulo(), switch2.getNombre(), switch2.getVelocidadderecepcion(), "Entregado"};
            modelo2.addRow(newrow);
            tabla2.setModel(modelo2);
            try {
                Thread.sleep(switch2.getVelocidadtransmision() * 1000);
            } catch (InterruptedException e) {
            }
            Object[] newrow2 = {mensaje.getTitulo(), "Router con IP: " + switch2.getRouter().getDireccionIP(), switch2.getVelocidadtransmision(), "Entregado"};
            modelo2.addRow(newrow2);
            tabla2.setModel(modelo2);
            try {
                Thread.sleep(switch1.getRouter().getVelocidadderecep() * 1000);
            } catch (InterruptedException e) {
            }
            Object[] newrow3 = {mensaje.getTitulo(), "Router con IP: " + switch1.getRouter().getDireccionIP(), switch1.getRouter().getVelocidadderecep(), "Entregado"};
            modelo2.addRow(newrow3);
            tabla2.setModel(modelo2);
            try {
                Thread.sleep(switch1.getRouter().getVelocidaddetrans() * 1000);
            } catch (InterruptedException e) {
            }
            Object[] newrow4 = {mensaje.getTitulo(), switch1.getNombre(), (switch1.getRouter().getVelocidaddetrans()), "Entregado"};
            modelo2.addRow(newrow4);
            tabla2.setModel(modelo2);

            try {
                Thread.sleep(switch1.getVelocidadtransmision() * 1000);
            } catch (InterruptedException e) {
            }
            for (PC p : switch1.getPcs()) {
                if (p.getDireccionIP().equalsIgnoreCase(IPDestino)) {
                    Object[] newrow5 = {mensaje.getTitulo(), "PC con IP: " + IPDestino, switch1.getVelocidadtransmision(), "Entregado"};
                    modelo2.addRow(newrow5);
                    tabla2.setModel(modelo2);
                }
            }

        } else if (ver == 3) {
            System.out.println("gay6");
            try {
                Thread.sleep(switch1.getVelocidadderecepcion() * 1000);
            } catch (InterruptedException e) {
            }

            Object[] newrow = {mensaje.getTitulo(), switch1.getNombre(), switch1.getVelocidadderecepcion(), "Entregado"};
            modelo.addRow(newrow);
            tabla.setModel(modelo);
            try {
                Thread.sleep(switch1.getVelocidadtransmision() * 1000);
            } catch (InterruptedException e) {
            }
            int cont = 0;
            PC pe = null;
            for (PC t : switch1.getPcs()) {
                if (t.getDireccionIP().equals(IPDestino)) {
                    pe = t;
                }
            }
            DefaultTableModel modelo3 = (DefaultTableModel) tabla.getModel();
            Object[] newrow2 = {mensaje.getTitulo(), "PC con IP: " + IPDestino, switch1.getVelocidadtransmision(), "Entregado"};
            modelo3.addRow(newrow2);
            tabla.setModel(modelo3);
            pe.getMensajes().add(mensaje);

        } else if (ver == 4) {
            System.out.println("gay7");
            try {
                Thread.sleep(switch2.getVelocidadderecepcion() * 1000);
            } catch (InterruptedException e) {
            }
            try {
                Object[] newrow = {mensaje.getTitulo(), switch2.getNombre(), switch2.getVelocidadderecepcion(), "Entregado"};
                modelo2.addRow(newrow);
                tabla2.setModel(modelo2);

                Thread.sleep(switch2.getVelocidadtransmision() * 1000);
            } catch (Exception e) {
            }
            int cont = 0;
            PC pe = null;
            for (PC t : switch2.getPcs()) {
                if (t.getDireccionIP().equals(IPDestino)) {
                    pe = t;
                }
            }
            Object[] newrow2 = {mensaje.getTitulo(), "PC con IP: " + IPDestino, switch2.getVelocidadtransmision(), "Entregado"};
            modelo2.addRow(newrow2);
            tabla2.setModel(modelo2);
            pe.getMensajes().add(mensaje);

        }

    }
}
