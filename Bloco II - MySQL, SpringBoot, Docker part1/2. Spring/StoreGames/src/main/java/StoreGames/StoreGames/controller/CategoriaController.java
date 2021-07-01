package StoreGames.StoreGames.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import StoreGames.StoreGames.model.Categoria;
import StoreGames.StoreGames.repository.CategoriaRepository;

@RestController
@RequestMapping("/categoria")
@CrossOrigin("*") // aceitar qualquer API
public class CategoriaController {

	@Autowired
	private CategoriaRepository repository;

	@GetMapping
	public ResponseEntity<List<Categoria>> GetAll() {

		return ResponseEntity.ok(repository.findAll());

	};
	
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> getByIDCategoria(@PathVariable long id) // List > objetos 
	{
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build()); // função enxuta como se fosse um if else
	}
	
	@GetMapping("/descricao/{descricao}")
	public ResponseEntity<List<Categoria>> getByDescricaoCategoria(@PathVariable String descricao)
	{
		return ResponseEntity.ok(repository.findAllByDescricaoContainingIgnoreCase(descricao));
	}

	@PostMapping
	public ResponseEntity<Categoria> postCategoria(@RequestBody Categoria categoria) {

		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(categoria));

	}; // ResponseEntity > resposta da entidade, que é a resposta da tabela

	@PutMapping
	public ResponseEntity<Categoria> putCategoria (@RequestBody Categoria categoria) 
	{
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(categoria));
	}
		
	@DeleteMapping("/{id}")
	public void deleteCategoria (@PathVariable long id)
	{
		repository.deleteById(id);
	}
	
}
