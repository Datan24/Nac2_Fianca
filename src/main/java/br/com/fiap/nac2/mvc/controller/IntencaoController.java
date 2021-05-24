package br.com.fiap.nac2.mvc.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.nac2.mvc.dto.Intencao;
import br.com.fiap.nac2.mvc.service.impl.IntencaoServiceImpl;

@Controller
public class IntencaoController {
	
	@Autowired
	IntencaoServiceImpl service;

	@GetMapping("nova-intencao")
	public  ModelAndView homeIntencao() {
		ModelAndView view = new ModelAndView("intencao");
		view.addObject(new Intencao());
		return view;
	}
	
	@PostMapping("salvar-intencao")
	public String salvarProduto(@Valid Intencao intencao, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute(intencao);
			return "produto";
		}
		service.salvarIntencao(intencao);
		return "redirect:/";
	}
}
