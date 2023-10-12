package br.com.wilian.ProjetoApiContAcad.entitiesDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProfessorDTO {

	private int codigo;
	private String nomeUsuario;
	private String senha;
	
	private TrabalhoDTO trabalho;
	
}
