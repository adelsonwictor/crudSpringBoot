package br.edu.ifal.lista_convidados.model ;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifal.lista_convidados.model.Convidado;

@Repository
public interface Convidados extends JpaRepository<Convidado, Long>{
    
}