package cl.sebastianrojo.bibliotecabooklet.repository;

import java.util.List;

import cl.sebastianrojo.bibliotecabooklet.model.Libro;

/**
 * ILibroRepository
 */
public interface ILibroRepository {

    public List<Libro> findAll();
    public Libro findById(Integer id);
    public Integer create(Libro libro);
    public Integer update(Libro libro);
    public Integer delete(Libro libro);
    
}