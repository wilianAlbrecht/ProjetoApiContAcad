package br.com.wilian.ProjetoApiContAcad.entitiesDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NotaDTO {

	private String nomeAluno;
	private String descricaoTrabalho;
	
	private Double notaAluno;
	
}
