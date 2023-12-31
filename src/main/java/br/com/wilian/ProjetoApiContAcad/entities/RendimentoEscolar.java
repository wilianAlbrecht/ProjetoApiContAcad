package br.com.wilian.ProjetoApiContAcad.entities;

import java.util.List;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RendimentoEscolar {

	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@GenericGenerator(name="id", type = org.hibernate.id.IncrementGenerator.class)
	@GeneratedValue(generator="id")
	private int codigo;
	
	@ManyToOne
	@JoinColumn(name = "aluno_codigo")
	private Aluno aluno;
	
	@ManyToOne
	@JoinColumn(name = "turma_codigo")
	private Turma turma;
	
	@OneToMany(mappedBy = "rendimentoEscolar")
	private List<TrabalhosNotaPorRendimento> trabalhosNostaPorRendimento;
	
	
	private Double prova1;
	private Double prova2;
	
	private Double mediaTrabalhos;
	private Double mediaGeral;
	
	
}
