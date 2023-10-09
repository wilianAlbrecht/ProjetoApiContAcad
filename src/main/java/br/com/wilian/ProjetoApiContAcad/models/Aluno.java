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
public class Aluno extends BasePessoa{
	
	
	private int periodo;

	@ManyToOne
	@JoinColumn(name = "turma_codigo")
	private Turma turma;
	
	@OneToMany(mappedBy = "aluno")
	private List<TrabalhoNota> trabalhoNota;
	
	@OneToMany(mappedBy = "aluno")
	private List<RendimentoEscolar> rendimentoEscolar;

	//constructor
	public Aluno(int codigo, String nome, Date dataNascimento, String nomeUsuario, String senha, int periodo,
			Turma turma) {
		super(codigo, nome, dataNascimento, nomeUsuario, senha);
		this.periodo = periodo;
		this.turma = turma;
	}
	
}
