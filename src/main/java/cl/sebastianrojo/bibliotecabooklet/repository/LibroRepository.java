package cl.sebastianrojo.bibliotecabooklet.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import cl.sebastianrojo.bibliotecabooklet.mapper.LibroMapper;
import cl.sebastianrojo.bibliotecabooklet.model.Libro;

/**
 * LibroRepository
 */
@Repository
public class LibroRepository implements ILibroRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Libro> findAll() {
        return jdbcTemplate.query("SELECT * FROM libro", new LibroMapper());
    }

    @Override
    public Libro findById(Integer id) {
        return jdbcTemplate.queryForObject("SELECT * FROM libro WHERE id = ?", new LibroMapper(), new Object[] {id});
    }

    @Override
    public Integer create(Libro libro) {
        return jdbcTemplate.update("INSERT INTO libro VALUES (?, ?, ?, ?, ?, ?)", libro.getId(), libro.getTitulo(), libro.getAnoPublicacion(), libro.getAutor(), libro.getImprenta(), libro.getDisponible());
    }

    @Override
    public Integer update(Libro libro) {
        return jdbcTemplate.update("UPDATE libro SET titulo = ?, ano ?, autor = ?, imprenta = ?, disponible = ? WHERE id = ?", libro.getTitulo(), libro.getAnoPublicacion(), libro.getAutor(), libro.getImprenta(), libro.getDisponible(), libro.getId());
    }

    @Override
    public Integer delete(Libro libro) {
        return jdbcTemplate.update("DELETE FROM libro WHERE id = ?", libro.getId());
    }

}
