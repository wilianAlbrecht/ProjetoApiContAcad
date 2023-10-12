package br.com.wilian.ProjetoApiContAcad.entities;

import java.util.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public abstract class BasePessoa {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected Long codigo;
	protected String nome;
	protected Date dataNascimento;
	protected String nomeUsuario;
	protected String senha;
	
	
	
}