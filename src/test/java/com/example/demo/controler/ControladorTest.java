package com.example.demo.controler;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.modelo.Libro;
import com.example.demo.service.LibroService;



@RunWith(SpringRunner.class)
@SpringBootTest
class ControladorTest {


	@Autowired
	private LibroService service;
	
	@BeforeEach
	void setUp() throws Exception {
		service = new LibroService();
		
	}

	@Test
	void test() {
		Libro libro1 = new Libro(4,"LibroTest","Nacho",5,"GeneroTest",8);
		service.save(libro1);
		
		assertTrue(service.listarTodos().size() > 0);
	}
	
	@Test
	void test2() {
		assertTrue(true);
	}

}
