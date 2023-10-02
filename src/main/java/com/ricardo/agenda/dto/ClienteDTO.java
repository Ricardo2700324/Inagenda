package com.ricardo.agenda.dto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import com.ricardo.agenda.entities.Cliente;
import com.ricardo.agenda.entities.Endereco;

public class ClienteDTO {
	
	private Integer id;

	@NotEmpty(message="Preenchimento Obrigatório!")
	@Length(min=5, max=120, message="O tamanho deve ser entre 5 e 120 caracteres!")
	private String primeiroNome;

	@NotEmpty(message="Preenchimento Obrigatório!")
	@Length(min=5, max=120, message="O tamanho deve ser entre 5 e 120 caracteres!")
	private String ultimoNome;

	@NotEmpty(message="Preenchimento Obrigatório!")
	@Email(message="Email inválido!")
	private String email;
	
	@NotEmpty(message="Preenchimento Obrigatório!")
	@Length(min=11, max=11)
	private String cpf;
	
	@NotEmpty(message="Preenchimento Obrigatório!")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private String dataNascimento;
	
	private Set<String> telefones = new HashSet<>(); 
	
	private List<Endereco> enderecos = new ArrayList<>();
	

	public ClienteDTO() {
	}

	
	

//	public ClienteDTO(Integer id,
//			 String primeiroNome,
//			 String ultimoNome,
//			 String email,
//			 String cpf,
//			 String dataNascimento, Set<String> telefones,
//			List<Endereco> enderecos) {
//		super();
//		this.id = id;
//		this.primeiroNome = primeiroNome;
//		this.ultimoNome = ultimoNome;
//		this.email = email;
//		this.cpf = cpf;
//		this.dataNascimento = dataNascimento;
//		this.telefones = telefones;
//		this.enderecos = enderecos;
//	}




	public ClienteDTO(Cliente entity) {
		super();
		this.id = entity.getId();;
		this.primeiroNome = entity.getPrimeiroNome();
		this.ultimoNome = entity.getUltimoNome();
		this.email = entity.getEmail();
		this.cpf = entity.getEmail();
		this.dataNascimento = entity.getDataNascimento();
		this.telefones = entity.getTelefones();
		this.enderecos = entity.getEnderecos();
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getPrimeiroNome() {
		return primeiroNome;
	}


	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}


	public String getUltimoNome() {
		return ultimoNome;
	}


	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public Set<String> getTelefones() {
		return telefones;
	}


	public void setTelefones(Set<String> telefones) {
		this.telefones = telefones;
	}
	


	public List<Endereco> getEnderecos() {
		return enderecos;
	}


	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
	
}
