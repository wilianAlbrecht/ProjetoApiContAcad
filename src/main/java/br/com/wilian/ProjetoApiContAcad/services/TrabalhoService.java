package br.com.wilian.ProjetoApiContAcad.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.wilian.ProjetoApiContAcad.abstractServices.TrabalhoAbstractService;
import br.com.wilian.ProjetoApiContAcad.entities.Aluno;
import br.com.wilian.ProjetoApiContAcad.entities.Trabalho;
import br.com.wilian.ProjetoApiContAcad.repositorys.TrabalhoRepository;


public class TrabalhoService  implements TrabalhoAbstractService{

	@Autowired
	final TrabalhoRepository trabalhoRepository;
	
	public TrabalhoService (TrabalhoRepository trabalhoRepository) {
		super();
		this.trabalhoRepository = trabalhoRepository;
	}
	
	public TrabalhoService () {
		this.trabalhoRepository = null;
	}

	
	@Override
	public void salvar(Trabalho trabalho) {
		trabalhoRepository.save(trabalho);
	}

	
	
	
}
