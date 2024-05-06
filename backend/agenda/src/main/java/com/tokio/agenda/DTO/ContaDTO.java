package com.tokio.agenda.DTO;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.tokio.agenda.entities.Conta;

public class ContaDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numero;
    private String nome;

    public ContaDTO() {
	
    }
    
    public ContaDTO(Long id, String numero, String nome) {
		this.id = id;
		this.numero = numero;
		this.nome = nome;
	}

	public ContaDTO(Conta entity) {
		this.id = entity.getId();
		this.numero = entity.getNumero();
		this.nome = entity.getNome();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
