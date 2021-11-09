package cl.sebastianrojo.bibliotecabooklet.service;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.sebastianrojo.bibliotecabooklet.model.Libro;
import cl.sebastianrojo.bibliotecabooklet.repository.ILibroRepository;
import cl.sebastianrojo.bibliotecabooklet.vo.LibroVO;

/**
 * LIbroService
 */
@Service
public class LIbroService implements ILibroService {

    @Autowired
    ILibroRepository libroRepository;

    private static final Logger logger = LoggerFactory.getLogger(LIbroService.class);
    private LibroVO libroVO;

    @Override
    public LibroVO findAll() {
        libroVO = new LibroVO(new ArrayList<Libro>(), "Error al buscar listado.");
        try {
            libroVO.setLibros(libroRepository.findAll());
            libroVO.setMensaje(String.format("Se encontraron %d libros", libroVO.getLibros().size()));
        } catch (Exception e) {
            logger.error(String.format("Error en LibroService: findAll" + e));
        }
        return libroVO;
    }
    
}