package StoreGames.StoreGames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table (name = "tb_categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotEmpty(message = "Nome não pode estar vazio")
	private String nome;

	@NotEmpty(message = "Descrição não pode estar vazia")
	private String descricao;

	@NotEmpty(message = "Idade não pode estar vazia")
	private Long classIdade;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Long getClassIdade() {
		return classIdade;
	}

	public void setClassIdade(Long classIdade) {
		this.classIdade = classIdade;
	}

}
