package lab7.leonardobanegas;

public class Mensaje {

    private String dirIPorigen;
    private String dirIPdestino;
    private String titulo;
    private String contenido;

    public Mensaje(String dirIPorigen, String dirIPdestino, String titulo, String contenido) {
        this.dirIPorigen = dirIPorigen;
        this.dirIPdestino = dirIPdestino;
        this.titulo = titulo;
        this.contenido = contenido;
    }

    public String getDirIPorigen() {
        return dirIPorigen;
    }

    public void setDirIPorigen(String dirIPorigen) {
        this.dirIPorigen = dirIPorigen;
    }

    public String getDirIPdestino() {
        return dirIPdestino;
    }

    public void setDirIPdestino(String dirIPdestino) {
        this.dirIPdestino = dirIPdestino;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Mensaje{" + "dirIPorigen=" + dirIPorigen + ", dirIPdestino=" + dirIPdestino + ", titulo=" + titulo + ", contenido=" + contenido + '}';
    }

}
