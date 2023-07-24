package br.com.cbf.campeonatobrasileiro.Rest;

import br.com.cbf.campeonatobrasileiro.Dto.JogoDto;
import br.com.cbf.campeonatobrasileiro.Entity.Jogo;
import br.com.cbf.campeonatobrasileiro.Services.JogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/jogos")
public class JogoRestController {

    @Autowired
    private JogoService jogoService;

    @PostMapping("/gerar-jogos")
    public ResponseEntity<Void> gerarJogos(){
       jogoService.gerarJogos(LocalDateTime.now(), Arrays.asList());
       return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<JogoDto>> obterJogos(){
        return ResponseEntity.ok().body(jogoService.listarJogos());
    }

    @PostMapping("/finalizar/{id}")
    public ResponseEntity<JogoDto> finalizar (@PathVariable Integer id, @RequestBody JogoDto jogoDto) throws Exception {
        return ResponseEntity.ok().body(jogoService.finalizar(id, jogoDto));
    }

    @GetMapping("/jogo/{id}")
    public ResponseEntity<JogoDto> obterJogo(@PathVariable Integer id){
        return ResponseEntity.ok().body(jogoService.obterJogo(id));
    }

   /* @GetMapping("/classificacao")
    public ResponseEntity<ClassificacaoDto> Classificacao (){
        return ResponseEntity.ok().body(jogoService.obterClassificacao());
    }*/


}
