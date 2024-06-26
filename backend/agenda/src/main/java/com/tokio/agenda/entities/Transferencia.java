package com.tokio.agenda.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transferencia {
 	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 	
    private String contaOrigem;
    
    private String contaDestino;
    
    private BigDecimal valor;
    private LocalDate dataTransferencia;
    private LocalDate dataAgendamento;
    private BigDecimal taxa;

    
    public Transferencia() {
    	
    }


	public Transferencia(Long id, String contaOrigem, String contaDestino, BigDecimal valor, LocalDate dataTransferencia,
			LocalDate dataAgendamento, BigDecimal taxa) {
		this.id = id;
		this.contaOrigem = contaOrigem;
		this.contaDestino = contaDestino;
		this.valor = valor;
		this.dataTransferencia = dataTransferencia;
		this.dataAgendamento = dataAgendamento;
		this.taxa = taxa;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getContaOrigem() {
		return contaOrigem;
	}


	public void setContaOrigem(String contaOrigem) {
		this.contaOrigem = contaOrigem;
	}


	public String getContaDestino() {
		return contaDestino;
	}


	public void setContaDestino(String contaDestino) {
		this.contaDestino = contaDestino;
	}


	public BigDecimal getValor() {
		return valor;
	}


	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}


	public LocalDate getDataTransferencia() {
		return dataTransferencia;
	}


	public void setDataTransferencia(LocalDate dataTransferencia) {
		this.dataTransferencia = dataTransferencia;
	}


	public LocalDate getDataAgendamento() {
		return dataAgendamento;
	}


	public void setDataAgendamento(LocalDate dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}


	public BigDecimal getTaxa() {
		return taxa;
	}


	public void setTaxa(BigDecimal taxa) {
		this.taxa = taxa;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transferencia other = (Transferencia) obj;
		return Objects.equals(id, other.id);
	}
    

    
    
    
}

