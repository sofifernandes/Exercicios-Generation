package com.pontosaltos.pontosaltos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/PontosAltos")
public class PontosAltosController {
	
	@GetMapping
	public String pontos() {
		return "Que papel seus grupos organizados têm em sua vida? São importantes? Você gosta de se reunir com eles? Por que?\r\n" + 
				"O grupo que irei citar para esta resposta é minha família, pois, por eles, por ensinamentos, convívio, e sentimentos que nos rodeiam, como carinho, amor, empatia e muita felicidade, que me tornei quem sou hoje. Sua importância na minha vida é imensurável, definitivamente não viveria plenamente feliz se um deles não fizessem mais parte da minha vida. Todas as vezes que nos reunimos, seja minha família inteira, ou apenas parte dela, posso sentir todos conforto e segurança que há no mundo. Nunca estarei sozinha.\r\n";
	}
}
