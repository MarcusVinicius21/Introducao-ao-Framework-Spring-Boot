package br.org.generation.olamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class objetivosController {

	@GetMapping
	public String objetivos() {
		return "Sigo na busca de absorver o m�ximo que puder de conhecimento da GEN, "
				+ " tirando as d�vidas com os instrutores e colocando em pr�tica";
	}
}
