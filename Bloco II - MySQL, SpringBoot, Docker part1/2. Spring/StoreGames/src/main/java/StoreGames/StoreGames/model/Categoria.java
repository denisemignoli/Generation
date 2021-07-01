package StoreGames.StoreGames.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotEmpty(message = "Nome não pode estar vazio")
	@Size(min = 3, max = 15)
	private String nomeCategoria;

	@NotEmpty(message = "Descrição não pode estar vazia")
	@Size(min = 3, max = 255)
	private String descricao;

	@NotEmpty(message = "Idade não pode estar vazia")
	private Long idade;

	@OneToMany(mappedBy = "categoria")
	@JsonIgnoreProperties("categoria")
	private List<Produto> produtos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Long getIdade() {
		return idade;
	}

	public void setIdade(Long idade) {
		this.idade = idade;
	}

	public List<Produto> getProduto() {
		return produtos;
	}

	public void setProduto(List<Produto> produto) {
		this.produtos = produto;
	}

}
