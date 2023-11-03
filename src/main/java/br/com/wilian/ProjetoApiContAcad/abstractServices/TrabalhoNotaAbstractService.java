package br.com.wilian.ProjetoApiContAcad.abstractServices;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wilian.ProjetoApiContAcad.entities.TrabalhoNota;

public interface TrabalhoNotaAbstractService extends JpaRepository<TrabalhoNota, Long> {

}
