package br.com.wilian.ProjetoApiContAcad.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wilian.ProjetoApiContAcad.entities.Trabalho;

public interface TrabalhoRepository extends JpaRepository<Trabalho, Long>{
	
	Trabalho findByDescricao(String descricao);
	
}
