package br.com.wilian.ProjetoApiContAcad.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wilian.ProjetoApiContAcad.entities.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long>{

	Professor findByNomeUsuarioAndSenha(String nomeUsuario, String senha);
	
}
