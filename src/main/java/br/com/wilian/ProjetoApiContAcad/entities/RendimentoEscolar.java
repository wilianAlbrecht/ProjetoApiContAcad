package br.com.wilian.ProjetoApiContAcad.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
	
	@ManyToOne
	@JoinColumn(name = "aluno_codigo")
	private Aluno aluno;
	
	@ManyToOne
	@JoinColumn(name = "turma_codigo")
	private Turma turma;
	
	@OneToMany
	private List<TrabalhoNota> trabalhoNota;
	
	
	private Double prova1;
	private Double prova2;
	
	private Double mediaTrabalhos;
	private Double mediaGeral;
	
	
}
