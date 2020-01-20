package br.edu.ifal.lista_convidados.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Convidado implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private long id;
    private String nome;
    private Integer quantidadeAcompanhantes;

    public void setId(long id){
        this.id = id;
    }

    public Long getId (){
        return id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setAcompanhantes(Integer quantidadeAcompanhantes){
        this.quantidadeAcompanhantes = quantidadeAcompanhantes;
    }

    public Integer getQuantidadeAcompanhantes(){
        return quantidadeAcompanhantes;
    }
}