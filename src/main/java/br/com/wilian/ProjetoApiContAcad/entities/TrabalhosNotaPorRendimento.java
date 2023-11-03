package br.com.wilian.ProjetoApiContAcad.entities;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
@Setter
@Getter
public class TrabalhosNotaPorRendimento {

	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@GenericGenerator(name="id", type = org.hibernate.id.IncrementGenerator.class)
	@GeneratedValue(generator="id")
	private Long codigo;
	
	@ManyToOne
	@JoinColumn(name = "rendimentoEscolar_codigo")
	private RendimentoEscolar rendimentoEscolar;
	
	@OneToOne
	@JoinColumn(name = "trabalhosNotaPorRendimento_codigo")
	private TrabalhoNota trabalhoNota;
	
}
