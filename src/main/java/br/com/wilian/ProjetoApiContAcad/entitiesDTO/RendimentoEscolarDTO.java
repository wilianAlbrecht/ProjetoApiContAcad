package br.com.wilian.ProjetoApiContAcad.entitiesDTO;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RendimentoEscolarDTO {

	private String nome;
	private String mediaGeral;
	private String mediaTrabalhos;
	private String prova1;
	private String prova2;
	private String professor;
	private List<String> notasTrabalhos;
}
