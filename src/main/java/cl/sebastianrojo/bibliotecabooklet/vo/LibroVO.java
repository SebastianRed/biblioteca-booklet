package cl.sebastianrojo.bibliotecabooklet.vo;

import java.util.List;

import cl.sebastianrojo.bibliotecabooklet.model.Libro;

/**
 * LibroVO
 */
public class LibroVO {

    private List<Libro> libros;
    private String mensaje;

    public LibroVO() {
    }

    public LibroVO(List<Libro> libros, String mensaje) {
        this.libros = libros;
        this.mensaje = mensaje;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "LibroVO [libros=" + libros + ", mensaje=" + mensaje + "]";
    }

}