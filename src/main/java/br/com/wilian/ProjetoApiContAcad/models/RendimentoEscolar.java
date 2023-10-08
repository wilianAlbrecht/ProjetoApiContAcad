package br.com.wilian.ProjetoApiContAcad.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@AllArgsConstructor
@Getter
@Setter
public class RendimentoEscolar {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codigo;
	
	@OneToMany(mappedBy = "trabalho_codigo")
	private Aluno aluno;
	
	@ManyToMany
	@JoinColumn(name = "turma_codigo")
	private Turma turma;
	
	private Double prova1;
	private Double prova2;
	
	@ManyToMany
	@JoinColumn(name = "trabalho_codigo")
	private List<TrabalhoNota> trabalhosNotas;
	
	private Double mediaTrabalhos;
	private Double mediaGeral;
	
	
}
