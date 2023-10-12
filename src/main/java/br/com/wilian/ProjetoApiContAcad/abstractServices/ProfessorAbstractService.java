package br.com.wilian.ProjetoApiContAcad.abstractServices;

import br.com.wilian.ProjetoApiContAcad.entities.Aluno;
import br.com.wilian.ProjetoApiContAcad.entities.Professor;
import br.com.wilian.ProjetoApiContAcad.entities.Trabalho;
import br.com.wilian.ProjetoApiContAcad.entities.TrabalhoNota;

public interface ProfessorAbstractService {

	Professor autenticarProfessor(String nomeUsuario, String senha);
	
	boolean lancarTrabalho(Trabalho trabalho);
	
	boolean lancarNotaTrabalho(TrabalhoNota trabalhoNota);
	
	Aluno buscarAlunoTrabalho(String nomeAluno);
	
	Trabalho buscarTrabalho(String descricao);
	
}
