package br.com.fiap.nac2.mvc.service;

import java.util.List;

import br.com.fiap.nac2.mvc.dto.Intencao;

public interface IntencaoService {

	List<Intencao> listaIntencao();
	Intencao detalharIntencao(Intencao intencao);
	Intencao salvarIntencao(Intencao intencao);
	Intencao editarIntecao(Long id);
	void excluirIntecao(Long id);
}
