package br.com.wilian.ProjetoApiContAcad.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wilian.ProjetoApiContAcad.entities.RendimentoEscolar;

public interface RendimentoEscolarRepository extends JpaRepository<RendimentoEscolar, Long> {
	
	RendimentoEscolar findByAlunoCodigo(long alunoCodigo);
	
}
