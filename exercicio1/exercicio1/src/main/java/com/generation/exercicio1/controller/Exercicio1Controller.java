package com.generation.exercicio1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/hello")

public class Exercicio1Controller {

		@GetMapping
		
		public String hello() {
			return "Habilidades: Trabalho em equipe, Atenção aos detalhes, Proatividade, Comunicação | \n"
					+ "Mentalidades: Orientação ao futuro, Responsabilidade pessoal, Mentalidade de crescimento, Persistência";
		}

	
}
