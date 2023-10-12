package br.com.wilian.ProjetoApiContAcad.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wilian.ProjetoApiContAcad.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{
	
	Aluno findByNome(String nomeAuno);
	
}
