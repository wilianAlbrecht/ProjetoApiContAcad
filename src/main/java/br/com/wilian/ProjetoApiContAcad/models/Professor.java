package br.com.wilian.ProjetoApiContAcad.models;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Professor extends BasePessoa{
	

	private String cargo;

	@ManyToOne
    @JoinColumn(name = "disciplina_codigo")
	private Disciplina disciplina;
	
	@OneToMany(mappedBy = "professor")
	private List<Turma> turma;
	
	
	//constructor
	public Professor(int codigo, String nome, Date dataNascimento, String nomeUsuario, String senha, String cargo,
			Disciplina disciplina) {
		super(codigo, nome, dataNascimento, nomeUsuario, senha);
		this.cargo = cargo;
		this.disciplina = disciplina;
	}
	
	
}
