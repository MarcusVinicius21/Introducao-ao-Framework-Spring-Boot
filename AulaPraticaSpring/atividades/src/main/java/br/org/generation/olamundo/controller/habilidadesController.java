package br.org.generation.olamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilidades")
public class habilidadesController {
	
	@GetMapping
	public String habilidades() {
		return "Atenção aos detalhes <br /> Muita persistência! <br / >";
	}
	
}
