package br.com.wilian.ProjetoApiContAcad.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wilian.ProjetoApiContAcad.entities.Aluno;
import br.com.wilian.ProjetoApiContAcad.entities.TrabalhoNota;

public interface TrabalhoNotaRepository extends JpaRepository<TrabalhoNota, Long> {
	List<TrabalhoNota> findByAluno(Aluno aluno);
}
