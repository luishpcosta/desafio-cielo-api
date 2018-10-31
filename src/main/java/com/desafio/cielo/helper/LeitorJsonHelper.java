package com.desafio.cielo.helper;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.springframework.stereotype.Component;

import com.desafio.cielo.models.Lancamento;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;


@Component
public class LeitorJsonHelper {
	
public  Lancamento carregarArquivo() {
		
		Gson gson = new Gson();
		
		Lancamento lacamento = null;
		ClassLoader classLoader = getClass().getClassLoader();

		try {
			String file = classLoader.getResource("lancamento-conta-legado.json").getFile();
			lacamento = gson.fromJson(new FileReader(file), Lancamento.class);
			
		} catch (JsonSyntaxException | JsonIOException | FileNotFoundException e) {
			e.printStackTrace();	
		} 
		
		return lacamento;
		
	}


}

