package br.com.wilian.ProjetoApiContAcad.entitiesDTO;

import br.com.wilian.ProjetoApiContAcad.entities.Disciplina;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TrabalhoDTO {

	private Disciplina disciplina;
	private String descricao;
	
}
