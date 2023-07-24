package br.com.cbf.campeonatobrasileiro.Dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class JogoDto {

    private Integer id;
    private Integer golsTime1;
    private Integer golsTime2;
    private Integer publicoPagante;
    private Integer rodada;
    private Boolean encerrado;
    private LocalDateTime data;
    private TimeDto time1;
    private TimeDto time2;
}
