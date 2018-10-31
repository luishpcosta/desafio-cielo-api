package com.desafio.cielo.services;

import java.util.List;

import com.desafio.cielo.models.LancamentoViewObject;

public interface LancamentoService {
	
	List<LancamentoViewObject> carregarLancamento();

}
