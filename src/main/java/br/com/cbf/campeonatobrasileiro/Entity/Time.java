package br.com.cbf.campeonatobrasileiro.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Time {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @Column(length = 20)
    private String nome;
    @Column(length = 4)
    private String sigla;
    @Column(length = 2)
    private String uf;
    private String estadio;

}
