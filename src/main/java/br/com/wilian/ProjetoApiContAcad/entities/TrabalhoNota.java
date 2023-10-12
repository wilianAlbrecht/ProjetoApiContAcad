package br.com.wilian.ProjetoApiContAcad.entities;

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
public class TrabalhoNota {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codigo;
	
	private Double notaAluno;
	
	@ManyToOne
	@JoinColumn(name = "aluno_codigo")
	private Aluno aluno;
	
	@ManyToOne
	@JoinColumn(name = "trabalho_codigo")
	private Trabalho trabalho;
	
	@ManyToOne
	private RendimentoEscolar rendimentoEscolar;
	
}
