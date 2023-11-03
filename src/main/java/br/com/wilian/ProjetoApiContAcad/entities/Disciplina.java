package br.com.wilian.ProjetoApiContAcad.entities;

import java.util.List;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Disciplina {
	
	
	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@GenericGenerator(name="id", type = org.hibernate.id.IncrementGenerator.class)
	@GeneratedValue(generator="id")
	private int codigo;
	private String nome;
	private String ementa;
	
	@OneToMany(mappedBy = "disciplina")
	private List<Professor> professor;
	
	@OneToMany(mappedBy = "disciplina")
	private List<Trabalho> trabalho;
	
	
	
}
