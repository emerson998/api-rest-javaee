package br.com.magna.pea2.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "locadora")
public class LocadoraModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String cnpj;
	private long senha;
	private LocalDate data = LocalDate.now();
	private String endereco;
	@OneToOne
	private FornecedorModel fornecedor;

	public LocadoraModel() {
	}

	public LocadoraModel(Long id, String cnpj, long senha, LocalDate data, String endereco,
			FornecedorModel fornecedor) {
		this.id = id;
		this.cnpj = cnpj;
		this.senha = senha;
		this.data = data;
		this.endereco = endereco;
		this.fornecedor = fornecedor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public long getSenha() {
		return senha;
	}

	public void setSenha(long senha) {
		this.senha = senha;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "LocadoraModel [id=" + id + ", cnpj=" + cnpj + ", senha=" + senha + ", data=" + data + ", endereco="
				+ endereco + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cnpj, data, endereco, id, senha);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LocadoraModel other = (LocadoraModel) obj;
		return Objects.equals(cnpj, other.cnpj) && Objects.equals(data, other.data)
				&& Objects.equals(endereco, other.endereco) && Objects.equals(id, other.id) && senha == other.senha;
	}

}
