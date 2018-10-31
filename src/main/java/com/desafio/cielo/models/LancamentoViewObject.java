package com.desafio.cielo.models;

import java.math.BigDecimal;

public class LancamentoViewObject {
	

	private String dataLancamento;
	private String descricao;
	private Integer numero;
	private String situacao;
	private String dataConfirmacao;
	private String dadosBancarios;
	private BigDecimal valorFinal;
	
	public String getDataLancamento() {
		return dataLancamento;
	}
	
	public void setDataLancamento(String dataDeLancamento) {
		this.dataLancamento = dataDeLancamento;
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
	
	public String getDataConfirmacao() {
		return dataConfirmacao;
	}
	
	public void setDataConfirmacao(String dataConfirmacao) {
		this.dataConfirmacao = dataConfirmacao;
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
