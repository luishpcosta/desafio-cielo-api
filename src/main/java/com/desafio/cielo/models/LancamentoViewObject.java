package com.desafio.cielo.models;

import java.math.BigDecimal;

public class LancamentoViewObject {
	

	private String dataDeLancamento;
	private String descricao;
	private Integer numero;
	private String situacao;
	private String dataDeConfirmacao;
	private String dadosBancarios;
	private BigDecimal valorFinal;
	
	public String getDataDeLancamento() {
		return dataDeLancamento;
	}
	
	public void setDataDeLancamento(String dataDeLancamento) {
		this.dataDeLancamento = dataDeLancamento;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Integer getNumero() {
		return numero;
	}
	
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public String getSituacao() {
		return situacao;
	}
	
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	public String getDataDeConfirmacao() {
		return dataDeConfirmacao;
	}
	
	public void setDataDeConfirmacao(String dataDeConfirmacao) {
		this.dataDeConfirmacao = dataDeConfirmacao;
	}
	
	public String getDadosBancarios() {
		return dadosBancarios;
	}
	
	public void setDadosBancarios(String dadosBancarios) {
		this.dadosBancarios = dadosBancarios;
	}
	
	public BigDecimal getValorFinal() {
		return valorFinal;
	}
	
	public void setValorFinal(BigDecimal valorFinal) {
		this.valorFinal = valorFinal;
	}

}
