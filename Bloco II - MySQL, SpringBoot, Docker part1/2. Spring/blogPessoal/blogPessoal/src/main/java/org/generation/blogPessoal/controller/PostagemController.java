package org.generation.blogPessoal.controller;
 

import org.generation.blogPessoal.repository.PostagemRepository;

import java.util.List;

import org.generation.blogPessoal.model.Postagem;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // é tipo o controlar de fluxo
@RequestMapping("/postagens") // dar o mapa pros verbos saberem o caminho de ida e o de volta
@CrossOrigin("*") // ele permite aceitar várias APIs, não interessa qual que seja
public class PostagemController {

	@Autowired // incorpora a classe PostagemRepository
	private PostagemRepository repository;
	
	
	@GetMapping
	public ResponseEntity<List<Postagem>> GetAll() // List > objetos 
	{
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Postagem> GetById(@PathVariable long id) // List > objetos 
	{
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build()); // função enxuta como se fosse um if else
	}
	
	@PostMapping
	public ResponseEntity<Postagem> Post(@RequestBody Postagem postagem) // Postagem = Entity
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(postagem));
	}
		
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id)
	{
		repository.deleteById(id);
	}
}

