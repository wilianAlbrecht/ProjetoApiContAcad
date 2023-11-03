package br.com.wilian.ProjetoApiContAcad.abstractServices;

import java.util.List;

import br.com.wilian.ProjetoApiContAcad.entities.Aluno;
import br.com.wilian.ProjetoApiContAcad.entities.RendimentoEscolar;
import br.com.wilian.ProjetoApiContAcad.entities.TrabalhoNota;
import br.com.wilian.ProjetoApiContAcad.entitiesDTO.AlunoDTO;

public interface AlunoAbstractService {
	
	Aluno autenticarAluno(AlunoDTO alunoDTO);
	
	RendimentoEscolar buscarRendimentoEscolar(Aluno aluno);
	
	List<TrabalhoNota> buscarTrabalhos(Aluno aluno);
}
