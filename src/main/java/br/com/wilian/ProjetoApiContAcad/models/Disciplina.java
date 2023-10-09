package br.com.wilian.ProjetoApiContAcad.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@AllArgsConstructor
@Getter
@Setter
public class Disciplina {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codigo;
	private String nome;
	private String ementa;
	
	@OneToMany(mappedBy = "disciplina")
	private List<Professor> professor;
	
	@OneToMany(mappedBy = "disciplina")
	private List<Trabalho> trabalho;
	
	
	
}
