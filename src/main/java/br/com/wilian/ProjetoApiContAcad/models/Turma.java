package br.com.wilian.ProjetoApiContAcad.models;

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
public class Turma {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codigo;
	
	@ManyToOne
	@JoinColumn(name = "professor_codigo")
	private Professor professor;
	
	@OneToMany(mappedBy = "turma")
	private List<Aluno> aluno;
	
	@OneToMany(mappedBy = "turma")
	private List<RendimentoEscolar> rendimentoEscolar;
	
	private int capacidade;
	
	
}
