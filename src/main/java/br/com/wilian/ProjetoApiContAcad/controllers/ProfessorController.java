package br.com.wilian.ProjetoApiContAcad.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.wilian.ProjetoApiContAcad.entities.Professor;
import br.com.wilian.ProjetoApiContAcad.entities.Trabalho;
import br.com.wilian.ProjetoApiContAcad.entities.TrabalhoNota;
import br.com.wilian.ProjetoApiContAcad.entitiesDTO.ProfessorDTO;
import br.com.wilian.ProjetoApiContAcad.entitiesDTO.TrabalhoNotaDTO;
import br.com.wilian.ProjetoApiContAcad.services.ProfessorService;

@RestController
@RequestMapping("/professor")
public class ProfessorController {

	final ProfessorService professorService;

	public ProfessorController(ProfessorService professorService) {
		this.professorService = professorService;
	}

	/**
	 * end point responsavel lancar novo trabalho
	 * 
	 * @param ProfessorDTO dto
	 * @return ResponseEntity
	 */
	@PutMapping("/lancar-trabalho")
	public ResponseEntity lancarTrabalho(@RequestBody ProfessorDTO dto) {
		try {
			Professor professor = professorService.autenticarProfessor(dto.getNomeUsuario(), dto.getSenha());
			if (professor != null) {

				Trabalho trabalho = new Trabalho();

				trabalho.setDisciplina(professor.getDisciplina());
				trabalho.setDescricao(dto.getTrabalho().getDescricao());

				boolean salvou = professorService.lancarTrabalho(trabalho);

				if (salvou) {
					return ResponseEntity.ok("Trabalho salvo com sucesso.");
				} else {
					return ResponseEntity.badRequest().body("Erro ao salvar o trabalho");
				}

			} else {
				return new ResponseEntity(HttpStatus.NO_CONTENT);
			}
		} catch (Exception e) {
			System.err.println("Erro ao autenticar usuario" + e);
			return ResponseEntity.badRequest().body("Erro ao autenticar usuario");
		}
	}

	@PutMapping("/lancar-nota-trabalho")
	public ResponseEntity LancarNotaTrabalho(@RequestBody TrabalhoNotaDTO trabalhoNotaDTO) {

		try {
			Professor professor = professorService.autenticarProfessor(trabalhoNotaDTO.getNomeUsuario(), trabalhoNotaDTO.getSenha());
			if (professor != null) {

				try {
					
					TrabalhoNota trabalhoNota = new TrabalhoNota();
					//busca o aluno 
					trabalhoNota.setAluno(professorService.buscarAlunoTrabalho(trabalhoNotaDTO.getNomeAluno()));
					//busca o trabalho
					trabalhoNota.setTrabalho(professorService.buscarTrabalho(trabalhoNotaDTO.getDescricaoTrabalho()));
					//seta a nota do aluno
					trabalhoNota.setNotaAluno(trabalhoNotaDTO.getNotaAluno());

					//salva a nota do trabalho
					boolean salvou = professorService.lancarNotaTrabalho(trabalhoNota);
					
					//valida se salvou para enviar a resposta adequada 
					if (salvou) {
						return ResponseEntity.ok("Nota de trabalho salvo com sucesso.");
					} else {
						return ResponseEntity.badRequest().body("Erro ao salvar a nota de trabalho");
					}

				} catch (Exception e) {
					System.err.println("Campo não preenchido " + e);
					return ResponseEntity.badRequest().body("Campo não preenchido ");
				}

			} else {
				return new ResponseEntity(HttpStatus.NO_CONTENT);
			}
			
		} catch (Exception e) {
			System.err.println("Erro ao autenticar usuario" + e);
			return ResponseEntity.badRequest().body("Erro ao autenticar usuario");
		}

	}

}
