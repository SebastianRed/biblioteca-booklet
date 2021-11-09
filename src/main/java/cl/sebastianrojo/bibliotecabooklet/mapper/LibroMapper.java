package cl.sebastianrojo.bibliotecabooklet.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import cl.sebastianrojo.bibliotecabooklet.model.Libro;

/**
 * LibroMapper
 */
public class LibroMapper implements RowMapper<Libro> {

    @Override
    public Libro mapRow(ResultSet rs, int rowNum) throws SQLException {
        Libro libro = new Libro();
        libro.setId(rs.getInt("id"));
        libro.setTitulo(rs.getString("titulo"));
        libro.setAnoPublicacion(rs.getInt("ano"));
        libro.setAutor(rs.getString("autor"));
        libro.setImprenta(rs.getString("imprenta"));
        libro.setDisponible(rs.getInt("disponible"));
        return libro;
    }

}