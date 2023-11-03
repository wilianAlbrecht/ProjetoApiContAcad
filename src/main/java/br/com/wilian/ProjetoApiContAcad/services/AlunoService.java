package br.com.wilian.ProjetoApiContAcad.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.wilian.ProjetoApiContAcad.abstractServices.AlunoAbstractService;
import br.com.wilian.ProjetoApiContAcad.entities.Aluno;
import br.com.wilian.ProjetoApiContAcad.entities.RendimentoEscolar;
import br.com.wilian.ProjetoApiContAcad.entities.TrabalhoNota;
import br.com.wilian.ProjetoApiContAcad.entitiesDTO.AlunoDTO;
import br.com.wilian.ProjetoApiContAcad.repositorys.AlunoRepository;
import br.com.wilian.ProjetoApiContAcad.repositorys.RendimentoEscolarRepository;
import br.com.wilian.ProjetoApiContAcad.repositorys.TrabalhoNotaRepository;

@Service
public class AlunoService implements AlunoAbstractService {
	
	@Autowired
	private AlunoRepository alunoRepository;
	@Autowired
	private RendimentoEscolarRepository rendimentoEscolarRepository;
	@Autowired
	private TrabalhoNotaRepository trabalhoNotaRepository;

	@Override
	public Aluno autenticarAluno(AlunoDTO alunoDTO) {
		
		return alunoRepository.findByNomeUsuarioAndSenha(alunoDTO.getNomeUsuario(), alunoDTO.getSenha());
		
	}

	@Override
	public RendimentoEscolar buscarRendimentoEscolar(Aluno aluno) {
		RendimentoEscolar rendimento = rendimentoEscolarRepository.findByAlunoCodigo(aluno.getCodigo());
		return rendimento;
	}
	
	@Override
	public List<TrabalhoNota> buscarTrabalhos(Aluno aluno) {
		return trabalhoNotaRepository.findByAluno(aluno);
	}
	
	

}
