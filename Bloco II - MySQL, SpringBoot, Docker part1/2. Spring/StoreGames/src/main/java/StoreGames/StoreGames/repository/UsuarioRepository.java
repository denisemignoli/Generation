package StoreGames.StoreGames.repository;

import java.util.Optional;

import StoreGames.StoreGames.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public Optional<Usuario> findByEmail(String email);

}