package br.com.fiap.nac2.mvc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.nac2.mvc.dto.Intencao;
import br.com.fiap.nac2.mvc.entity.IntencaoEntity;
import br.com.fiap.nac2.mvc.repository.IntencaoRepository;
import br.com.fiap.nac2.mvc.service.IntencaoService;

@Service
public class IntencaoServiceImpl implements IntencaoService {

	@Autowired
	private IntencaoRepository repository;

	@Override
	public List<Intencao> listaIntencao() {
		List<IntencaoEntity> lista = repository.findAll();
		List<Intencao> intencao = fromTo(lista);
		return intencao;
	}

	@Override
	public Intencao salvarIntencao(Intencao intencao) {
		IntencaoEntity entity = fromTo(intencao);
		entity = repository.save(entity);
		Intencao produtoRetorno = fromTo(entity);
		return produtoRetorno;
	}

	@Override
	public Intencao editarIntecao(Long id) {
		IntencaoEntity entity = repository.findById(id).get();
		return fromTo(entity);
	}

	@Override
	public void excluirIntecao(Long id) {
		repository.deleteById(id);

	}

	@Override
	public Intencao detalharIntencao(Intencao intencao) {
		return null;
	}

	private IntencaoEntity fromTo(Intencao intencao) {
		IntencaoEntity entity = new IntencaoEntity();
		entity.setId(intencao.getId());
		entity.setNomeCliente(intencao.getNomeCliente());
		entity.setEndereco(intencao.getEndereco());
		entity.setNumero(intencao.getNumero());
		entity.setCidade(intencao.getCidade());
		entity.setEstado(intencao.getEstado());
		entity.setCep(intencao.getCep());
		entity.setCpf(intencao.getCpf());
		entity.setRG(intencao.getRG());
		entity.setNascimento(intencao.getNascimento());
		entity.setEmail(intencao.getEmail());
		entity.setTelefoneResidencial(intencao.getTelefoneResidencial());
		entity.setCelular(intencao.getCelular());
		entity.setTipoFinanciamento(intencao.getTipoFinanciamento());
		entity.setQuantidadeParcelas(intencao.getQuantidadeParcelas());
		entity.setValorIntencao(intencao.getValorIntencao());
		entity.setSalario(intencao.getSalario());
		return entity;
	}

	private Intencao fromTo(IntencaoEntity entity) {
		Intencao intencao = new Intencao();
		intencao.setId(entity.getId());
		intencao.setNomeCliente(entity.getNomeCliente());
		intencao.setEndereco(entity.getEndereco());
		intencao.setNumero(entity.getNumero());
		intencao.setCidade(entity.getCidade());
		intencao.setEstado(entity.getEstado());
		intencao.setCep(entity.getCep());
		intencao.setCpf(entity.getCpf());
		intencao.setRG(entity.getRG());
		intencao.setNascimento(entity.getNascimento());
		intencao.setEmail(entity.getEmail());
		intencao.setTelefoneResidencial(entity.getTelefoneResidencial());
		intencao.setCelular(entity.getCelular());
		intencao.setTipoFinanciamento(entity.getTipoFinanciamento());
		intencao.setQuantidadeParcelas(entity.getQuantidadeParcelas());
		intencao.setValorIntencao(entity.getValorIntencao());
		intencao.setSalario(entity.getSalario());
		return intencao;
	}

	private List<Intencao> fromTo(List<IntencaoEntity> lista) {
		List<Intencao> listaDto = new ArrayList<>();
		for (IntencaoEntity intencaoEntity : lista) {
			Intencao dto = new Intencao();
			dto.setId(intencaoEntity.getId());
			dto.setNomeCliente(intencaoEntity.getNomeCliente());
			dto.setEndereco(intencaoEntity.getEndereco());
			dto.setNumero(intencaoEntity.getNumero());
			dto.setCidade(intencaoEntity.getCidade());
			dto.setEstado(intencaoEntity.getEstado());
			dto.setCep(intencaoEntity.getCep());
			dto.setCpf(intencaoEntity.getCpf());
			dto.setRG(intencaoEntity.getRG());
			dto.setNascimento(intencaoEntity.getNascimento());
			dto.setEmail(intencaoEntity.getEmail());
			dto.setTelefoneResidencial(intencaoEntity.getTelefoneResidencial());
			dto.setCelular(intencaoEntity.getCelular());
			dto.setTipoFinanciamento(intencaoEntity.getTipoFinanciamento());
			dto.setQuantidadeParcelas(intencaoEntity.getQuantidadeParcelas());
			dto.setValorIntencao(intencaoEntity.getValorIntencao());
			dto.setSalario(intencaoEntity.getSalario());
			listaDto.add(dto);
		}
		return listaDto;
	}

}
