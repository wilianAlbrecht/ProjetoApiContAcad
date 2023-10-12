package br.com.wilian.ProjetoApiContAcad.entitiesDTO;

import br.com.wilian.ProjetoApiContAcad.entities.TrabalhoNota;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class TrabalhoNotaDTO {

	private String nomeUsuario;
	private String senha;
	
	private String nomeAluno;
	private String descricaoTrabalho;
	
	private Double notaAluno;
	
	private TrabalhoNota trabalhoNota;
	
}
