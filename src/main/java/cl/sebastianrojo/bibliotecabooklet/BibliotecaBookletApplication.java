package cl.sebastianrojo.bibliotecabooklet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cl.sebastianrojo.bibliotecabooklet.service.ILibroService;

@SpringBootApplication
public class BibliotecaBookletApplication {

	public static void main(String[] args) {
		//SpringApplication.run(BibliotecaBookletApplication.class, args);
		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(AppConfig.class);
		ILibroService libroService = acac.getBean(ILibroService.class);
		System.out.println(libroService.findAll());
	}
}
