package br.com.fiap.nac2.mvc.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

public class Intencao implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	@NotBlank
	private String nomeCliente;
	@NotBlank
	private String endereco;
	private int numero;
	private String cidade;
	@NotBlank
	private String estado;
	@NotBlank
	private String cep;
	@NotBlank
	private String cpf;
	@NotBlank
	private String RG;
	@NotBlank
	private String nascimento;
	@NotBlank
	private String email;
	private String telefoneResidencial;
	@NotBlank
	private String celular;
	@NotBlank
	private String tipoFinanciamento;
	private int quantidadeParcelas;
	private int valorIntencao;
	private int salario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefoneResidencial() {
		return telefoneResidencial;
	}

	public void setTelefoneResidencial(String telefoneResidencial) {
		this.telefoneResidencial = telefoneResidencial;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getTipoFinanciamento() {
		return tipoFinanciamento;
	}

	public void setTipoFinanciamento(String tipoFinanciamento) {
		this.tipoFinanciamento = tipoFinanciamento;
	}

	public int getQuantidadeParcelas() {
		return quantidadeParcelas;
	}

	public void setQuantidadeParcelas(int quantidadeParcelas) {
		this.quantidadeParcelas = quantidadeParcelas;
	}

	public int getValorIntencao() {
		return valorIntencao;
	}

	public void setValorIntencao(int valorIntencao) {
		this.valorIntencao = valorIntencao;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
}
