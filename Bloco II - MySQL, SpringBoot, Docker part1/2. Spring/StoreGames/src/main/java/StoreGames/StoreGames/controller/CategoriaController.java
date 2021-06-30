package StoreGames.StoreGames.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import StoreGames.StoreGames.model.Categoria;
import StoreGames.StoreGames.repository.CategoriaRepository;

@RestController
@RequestMapping("/categoria")
@CrossOrigin("*") // aceitar qualquer API
public class CategoriaController {

	@Autowired
	public CategoriaRepository categoriaRepository;
	
	
	@PostMapping
	public ResponseEntity<Categoria>PostCategoria(); //ResponseEntity > resposta da entidade, que é a resposta da tabela
	
}
