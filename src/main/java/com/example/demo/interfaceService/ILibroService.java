package com.example.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.example.demo.modelo.Libro;

public interface ILibroService {
	public List<Libro>listarTodos();
	public Optional<Libro>listarPorId(int id);
	public int save(Libro p);
	public void delete(int id);
}
