package com.desafio.cielo.builder;

import java.util.ArrayList;
import java.util.List;

import com.desafio.cielo.models.Lancamento;
import com.desafio.cielo.models.LancamentoViewObject;

public class LancamentoContaBuilder {

	public static class Builder {

		
		private List<LancamentoViewObject> listaLancamento = new ArrayList<>();

		public Builder(final Lancamento lancamento) {

			lancamento.getListaControleLancamento().forEach(l -> {
				
				LancamentoViewObject lancamentoConta = new LancamentoViewObject();
				
				lancamentoConta.setDadosBancarios(l.getDadosBancarios());
				lancamentoConta.setDataDeConfirmacao(l.getDataEfetivaLancamento());
				lancamentoConta.setDataDeLancamento(l.getDataLancamentoContaCorrenteCliente());
				lancamentoConta.setDescricao(l.getDescricaoGrupoPagamento());
				lancamentoConta.setSituacao(l.getLancamentoContaCorrenteCliente().getNomeSituacaoRemessa());
				lancamentoConta.setNumero(l.getNumeroEvento());
				lancamentoConta.setValorFinal(l.getValorLancamentoRemessa());

				listaLancamento.add(lancamentoConta);
			});

		}

		public List<LancamentoViewObject> build() {
			return this.listaLancamento;
		}

	}

}
