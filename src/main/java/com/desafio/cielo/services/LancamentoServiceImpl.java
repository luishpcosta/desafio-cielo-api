package com.desafio.cielo.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.cielo.builder.LancamentoContaBuilder;
import com.desafio.cielo.helper.LeitorJsonHelper;
import com.desafio.cielo.models.Lancamento;
import com.desafio.cielo.models.LancamentoViewObject;


@Service
public class LancamentoServiceImpl implements LancamentoService {

	@Autowired
	private LeitorJsonHelper LeitorJsonHelper;
	
	@Override
	public List<LancamentoViewObject> carregarLancamento() {
		
		final Lancamento lancamento = LeitorJsonHelper.carregarArquivo();
		
		if(lancamento != null)
			return new LancamentoContaBuilder.Builder(lancamento).build();
		
		return null;
	}



}
