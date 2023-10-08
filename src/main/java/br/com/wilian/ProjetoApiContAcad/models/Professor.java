package br.com.wilian.ProjetoApiContAcad.models;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Professor extends BasePessoa{
	

	private String cargo;

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "disciplina_codigo")
	private Disciplina disciplina;
	
//	@OneToMany(mappedBy = "turma_codigo")
//	private Turma turma;

	
	//constructor
	public Professor(int codigo, String nome, Date dataNascimento, String nomeUsuario, String senha, String cargo,
			Disciplina disciplina) {
		super(codigo, nome, dataNascimento, nomeUsuario, senha);
		this.cargo = cargo;
		this.disciplina = disciplina;
	}
	
	
}
