package com.desafio.cielo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.cielo.models.LancamentoViewObject;
import com.desafio.cielo.services.LancamentoService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:4200") 
public class LancamentoContaResource {
	
	@Autowired
	private LancamentoService lancamentoService;
	
	@GetMapping(value = "/lancamentos")
	public ResponseEntity<List<LancamentoViewObject>> listAll() {
		return new ResponseEntity<List<LancamentoViewObject>>(lancamentoService.carregarLancamento(), HttpStatus.OK);
	}

}
