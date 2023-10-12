package br.com.wilian.ProjetoApiContAcad.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Professor extends BasePessoa{
	

	private String cargo;

	@ManyToOne
    @JoinColumn(name = "disciplina_codigo")
	private Disciplina disciplina;
	
	@OneToMany(mappedBy = "professor")
	private List<Turma> turma;
	
	
	//constructor
	public Professor(Long codigo, String nome, Date dataNascimento, String nomeUsuario, String senha, String cargo,
			Disciplina disciplina) {
		super(codigo, nome, dataNascimento, nomeUsuario, senha);
		this.cargo = cargo;
		this.disciplina = disciplina;
	}
	
//	public Professor() {
//		super();
//	};
	
	
}
