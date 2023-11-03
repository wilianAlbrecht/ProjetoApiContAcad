package br.com.wilian.ProjetoApiContAcad.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.wilian.ProjetoApiContAcad.entities.Aluno;
import br.com.wilian.ProjetoApiContAcad.entities.RendimentoEscolar;
import br.com.wilian.ProjetoApiContAcad.entities.TrabalhoNota;
import br.com.wilian.ProjetoApiContAcad.entitiesDTO.AlunoDTO;
import br.com.wilian.ProjetoApiContAcad.entitiesDTO.NotaDTO;
import br.com.wilian.ProjetoApiContAcad.entitiesDTO.RendimentoEscolarDTO;
import br.com.wilian.ProjetoApiContAcad.entitiesDTO.TrabalhoNotaDTO;
import br.com.wilian.ProjetoApiContAcad.services.AlunoService;

@RestController
@RequestMapping("aluno")
public class AlunoController {
	
	final AlunoService alunoService;

	public AlunoController(AlunoService alunoService) {
		this.alunoService = alunoService;
	}
	
	
	@GetMapping("/buscar-historico")
	public ResponseEntity buscarNotas(@RequestBody AlunoDTO alunoDTO) {
		
		try {
			
			Aluno aluno = alunoService.autenticarAluno(alunoDTO);
			
			if(aluno == null) {
				return ResponseEntity.ok().body("Erro ao autenticar usuario");
			}else {
				
				RendimentoEscolar rendimento = alunoService.buscarRendimentoEscolar(aluno);
				
				if(rendimento == null) {
					return ResponseEntity.ok().body("Aluno sem historico escolar");
				}
				
				RendimentoEscolarDTO rendimentoDTO = new RendimentoEscolarDTO();
				
				rendimentoDTO.setNome(rendimento.getAluno().getNome());
				rendimentoDTO.setMediaGeral(rendimento.getMediaGeral().toString());
				rendimentoDTO.setMediaTrabalhos(rendimento.getMediaTrabalhos().toString());
				rendimentoDTO.setProva1(rendimento.getProva1().toString());
				rendimentoDTO.setProva2(rendimento.getProva2().toString());
				rendimentoDTO.setProfessor(rendimento.getTurma().getProfessor().getNome());
				
				return ResponseEntity.ok().body(rendimentoDTO);
				
			}
			
		}catch (Exception e) {
			System.err.println("Erro ao buscar notas" + e);
			return ResponseEntity.badRequest().body("Erro ao buscar notas");
		}
		
	}
	
	@GetMapping("/buscar-trabalho")
	public ResponseEntity buscarTrabalhos(@RequestBody AlunoDTO alunoDTO) {
		
		try {
			
			Aluno aluno = alunoService.autenticarAluno(alunoDTO);
			
			if(aluno == null) {
				return ResponseEntity.ok().body("Erro ao autenticar usuario");
			}else {
				
				List<TrabalhoNota> trabalhos = new ArrayList<TrabalhoNota>();
				trabalhos =  alunoService.buscarTrabalhos(aluno);
				
				if(trabalhos == null) {
					return ResponseEntity.ok().body("Aluno sem trabalhos");
				}else {
					
					List<NotaDTO> trabalhoNotaDTO = new ArrayList<>();
					
					for(TrabalhoNota trabalho : trabalhos) {
						NotaDTO trabalhoNota = new NotaDTO();
						trabalhoNota.setNomeAluno(trabalho.getAluno().getNome());
						trabalhoNota.setDescricaoTrabalho(trabalho.getTrabalho().getDescricao());
						trabalhoNota.setNotaAluno(trabalho.getNotaAluno());
						
						trabalhoNotaDTO.add(trabalhoNota);
					}
					
					ObjectMapper objectMapper = new ObjectMapper();
					
					return ResponseEntity.ok().body(objectMapper.writeValueAsString(trabalhoNotaDTO));
				}
				
			}

		}catch (Exception e) {
			System.err.println("Erro ao buscar trabalhos" + e);
			return ResponseEntity.badRequest().body("Erro ao buscar trabalhos");
		}
		
	}

}
