package com.example.cursomc.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.example.cursomc.domain.Categoria;

public class CategoriaDTO implements Serializable {
	

	private static final long serialVersionUID = 1L;
	
	private Integer id; 
	
	@NotEmpty(message = "Preenchimento obrigatório")
	@Length(min=5, max=120, message = "O tamanho jdeve ser entre 5 e 120 caracteres")
	private String nome;
	
	@NotEmpty(message = "Preenchimento obrigatório")
	@Email(message = "Email inválido")
	private String email; 
	
	
	public CategoriaDTO() {
		
	}
	
	public CategoriaDTO(Categoria obj) {
		
		id = obj.getId();
		nome = obj.getNome();
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
