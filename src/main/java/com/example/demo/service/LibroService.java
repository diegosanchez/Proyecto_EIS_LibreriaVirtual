package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaceService.ILibroService;
import com.example.demo.interfaces.ILibro;
import com.example.demo.modelo.Libro;

@Service
public class LibroService implements ILibroService{

	@Autowired
	private ILibro data;
	
	@Override
	public List<Libro> listarTodos() {
		return (List<Libro>)data.findAll();
	}

	@Override
	public Optional<Libro> listarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Libro save(Libro p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
