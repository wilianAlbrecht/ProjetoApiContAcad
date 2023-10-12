package br.com.wilian.ProjetoApiContAcad.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.wilian.ProjetoApiContAcad.abstractServices.ProfessorAbstractService;
import br.com.wilian.ProjetoApiContAcad.entities.Aluno;
import br.com.wilian.ProjetoApiContAcad.entities.Professor;
import br.com.wilian.ProjetoApiContAcad.entities.Trabalho;
import br.com.wilian.ProjetoApiContAcad.entities.TrabalhoNota;
import br.com.wilian.ProjetoApiContAcad.repositorys.AlunoRepository;
import br.com.wilian.ProjetoApiContAcad.repositorys.ProfessorRepository;
import br.com.wilian.ProjetoApiContAcad.repositorys.TrabalhoNotaRepository;
import br.com.wilian.ProjetoApiContAcad.repositorys.TrabalhoRepository;

@Service
public class ProfessorService implements ProfessorAbstractService{

	@Autowired
	final ProfessorRepository professorRepository;
	@Autowired
	private TrabalhoRepository trabalhoRepository;
	@Autowired
	private TrabalhoNotaRepository trabalhoNotaRepository;
	@Autowired
	private AlunoRepository alunoRepository;
	
	
	public ProfessorService (ProfessorRepository professorRepository) {
		super();
		this.professorRepository = professorRepository;
	}
	
	/**
	 * metodo responsavel por autenticar o professor
	 * @param ProfessorDTO professorDTO = objeto DTO enviado pela API que contem usuario e senha
	 * @return retorna os dados do professor caso a autenticação seja efetuada
	 */
	@Override
	public Professor autenticarProfessor(String nomeUsuario, String senha) {
		
		try {

			return professorRepository.findByNomeUsuarioAndSenha(nomeUsuario, senha);
			
		}catch (Exception e) {
			System.err.println("Erro ao buscar autenticar usuario" + e);
			return null;
		}
	}
	
	

	@Override
	public boolean lancarTrabalho(Trabalho trabalho) {
		
		try {
			trabalhoRepository.save(trabalho);
			return true;
			
		} catch (Exception e) {
			System.err.println("Erro ao salvar o trabalho " + e);
			return false;
		}
		
	}

	@Override
	public boolean lancarNotaTrabalho(TrabalhoNota trabalhoNota) {

		try {
			trabalhoNotaRepository.save(trabalhoNota);
			return true;
			
		} catch (Exception e) {
			System.err.println("Erro ao salvar a nota do trabalho " + e);
			return false;
		}
	}

	
	@Override
	public Aluno buscarAlunoTrabalho(String nomeAluno) {
		
		return alunoRepository.findByNome(nomeAluno);
		
	}

	@Override
	public Trabalho buscarTrabalho(String descricao) {
		
		return trabalhoRepository.findByDescricao(descricao);
		
	}
	

	
	
}
