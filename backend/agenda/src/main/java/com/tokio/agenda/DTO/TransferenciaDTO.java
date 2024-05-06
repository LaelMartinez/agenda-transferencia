package com.tokio.agenda.DTO;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.tokio.agenda.entities.Transferencia;

public class TransferenciaDTO {
 	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 	
    private String contaOrigem;
    
    private String contaDestino;
    
    private BigDecimal valor;
    private LocalDate dataTransferencia;
    private LocalDate dataAgendamento;
    private BigDecimal taxa;

    
    public TransferenciaDTO() {
    	
    }


	public TransferenciaDTO(Long id, String contaOrigem, String contaDestino, BigDecimal valor, LocalDate dataTransferencia,
			LocalDate dataAgendamento, BigDecimal taxa) {
		this.id = id;
		this.contaOrigem = contaOrigem;
		this.contaDestino = contaDestino;
		this.valor = valor;
		this.dataTransferencia = dataTransferencia;
		this.dataAgendamento = dataAgendamento;
		this.taxa = taxa;
	}


	public TransferenciaDTO(Transferencia transferencia) {
		this.id = transferencia.getId();
		this.contaOrigem = transferencia.getContaOrigem();
		this.contaDestino = transferencia.getContaDestino();
		this.valor = transferencia.getValor();
		this.dataTransferencia = transferencia.getDataTransferencia();
		this.dataAgendamento = transferencia.getDataAgendamento();
		this.taxa = transferencia.getTaxa();
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

    
}

