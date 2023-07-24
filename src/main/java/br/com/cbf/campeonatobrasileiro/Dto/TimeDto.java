package br.com.cbf.campeonatobrasileiro.Dto;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class TimeDto {
    private Integer id;
    private String nome;
    private String sigla;
    private String uf;
    private String estadio;
}
