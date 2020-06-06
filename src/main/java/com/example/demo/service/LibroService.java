package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaceService.IlibroService;
import com.example.demo.interfaces.ILibro;
import com.example.demo.modelo.Libro;

@Service
public class LibroService implements IlibroService{

	@Autowired
	private ILibro data;
	
	@Override
	public List<Libro> listar() {
		return (List<Libro>)data.findAll();
	}

	@Override
	public Optional<Libro> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Libro p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
