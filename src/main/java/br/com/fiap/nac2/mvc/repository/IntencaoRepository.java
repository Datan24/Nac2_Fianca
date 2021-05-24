package br.com.fiap.nac2.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.nac2.mvc.entity.IntencaoEntity;

@Repository
public interface IntencaoRepository extends JpaRepository<IntencaoEntity, Long> {

}
