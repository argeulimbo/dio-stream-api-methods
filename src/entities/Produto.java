package entities;

public class Produto {
	
	private String nome;
	private Integer quantidade;
	private Double preco;
	private String codigo;
	
	public Produto() {
		
	}
	
	public Produto(String nome, int quantidade, double preco, String codigo) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return 
				"| "+ codigo + " - " + nome + ", " + quantidade + " unidades, unidade a R$ " + preco + " |";
	}
	
	
	
	

}
