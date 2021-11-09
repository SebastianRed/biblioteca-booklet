package cl.sebastianrojo.bibliotecabooklet.model;

/**
 * Libro
 */
public class Libro {

    private Integer id;
    private String titulo;
    private Integer anoPublicacion;
    private String autor;
    private String imprenta;
    private Integer disponible;

    public Libro() {
    }

    public Libro(Integer id, String titulo, Integer anoPublicacion, String autor, String imprenta, Integer disponible) {        this.id = id;
        this.titulo = titulo;
        this.anoPublicacion = anoPublicacion;
        this.autor = autor;
        this.imprenta = imprenta;
        this.disponible = disponible;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(Integer anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getImprenta() {
        return imprenta;
    }

    public void setImprenta(String imprenta) {
        this.imprenta = imprenta;
    }

    public Integer getDisponible() {
        return disponible;
    }

    public void setDisponible(Integer disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Libro [anoPublicacion=" + anoPublicacion + ", autor=" + autor + ", disponible=" + disponible + ", id="
                + id + ", imprenta=" + imprenta + ", titulo=" + titulo + "]";
    }
    
}