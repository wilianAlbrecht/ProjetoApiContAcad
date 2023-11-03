package br.com.wilian.ProjetoApiContAcad.entities;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TrabalhoNota {
	
	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@GenericGenerator(name="id", type = org.hibernate.id.IncrementGenerator.class)
	@GeneratedValue(generator="id")
	private Long codigo;
	
	private Double notaAluno;
	
	@ManyToOne
	@JoinColumn(name = "aluno_codigo")
	private Aluno aluno;
	
	@ManyToOne
	@JoinColumn(name = "trabalho_codigo")
	private Trabalho trabalho;
	
	@ManyToOne
	@JoinColumn(name = "")
	private RendimentoEscolar rendimentoEscolar;
	
	@OneToOne(mappedBy = "trabalhoNota")
	private TrabalhosNotaPorRendimento trabalhosNotaPorRendimento;
	
	
}
