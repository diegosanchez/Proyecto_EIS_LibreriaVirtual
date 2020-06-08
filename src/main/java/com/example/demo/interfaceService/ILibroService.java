package com.example.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.example.demo.modelo.Libro;

public interface ILibroService {
	public List<Libro>listar();
	public Optional<Libro>listarId(int id);
	public Libro save(Libro p);
	public void delete(int id);
}
