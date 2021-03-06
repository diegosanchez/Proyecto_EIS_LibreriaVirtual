package com.example.demo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.interfaceService.ILibroService;
import com.example.demo.modelo.Libro;

@RestController
@RequestMapping(value="/libros")
public class ControladorAPI {
	
	@Autowired
	private ILibroService service ;
	
	
	// localhost:8090/libros (GET) == LISTADO DE LIBROS
	@GetMapping
	public ResponseEntity<List<Libro>> getLibros() {
		List<Libro> libros = service.listarTodos() ;
		if (libros.isEmpty()) {
			return ResponseEntity.noContent().build() ;
		}
		return ResponseEntity.ok(libros);
	}
	
	// localhost:8090/libros (POST) == SE AGREGA UN LIBRO CON LOS DATOS QUE UNO QUIERA
	@PostMapping
	public ResponseEntity<Integer> addLibro(@RequestBody Libro libro) {
		Integer nuevoLibro = service.save(libro) ;
		return ResponseEntity.ok(nuevoLibro) ;
	}
}
