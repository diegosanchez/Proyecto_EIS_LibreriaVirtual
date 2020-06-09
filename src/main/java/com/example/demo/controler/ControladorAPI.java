package com.example.demo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.interfaceService.ILibroService;
import com.example.demo.modelo.Libro;

@RestController
@RequestMapping("/")
public class ControladorAPI {
	
	@Autowired
	private ILibroService service ;
	
	@GetMapping("libros")
	public ResponseEntity<List<Libro>> getLibros() {
		List<Libro> libros = service.listar() ;
		if (libros.isEmpty()) {
			return ResponseEntity.noContent().build() ;
		}
		return ResponseEntity.ok(libros);
	}
}
