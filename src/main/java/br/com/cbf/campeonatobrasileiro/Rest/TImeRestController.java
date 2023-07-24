package br.com.cbf.campeonatobrasileiro.Rest;

import br.com.cbf.campeonatobrasileiro.Dto.TimeDto;
import br.com.cbf.campeonatobrasileiro.Entity.Time;
import br.com.cbf.campeonatobrasileiro.Services.TimeService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/times")
public class TImeRestController {

    @Autowired
    private TimeService timeService;

    @GetMapping
    public ResponseEntity<List<TimeDto>>getTimes(){
        return ResponseEntity.ok().body(timeService.listarTimes());
    }

    @ApiOperation(value = "Obtém os dados de um time")
    @GetMapping(value = "{id}")
    public ResponseEntity<TimeDto> getTime(@PathVariable Integer id){
        return ResponseEntity.ok().body(timeService.obterTime(id));
    }

    @PostMapping
    public ResponseEntity<TimeDto> cadastrarTime ( @RequestBody TimeDto time) throws Exception {

        return ResponseEntity.ok().body(timeService.cadastrarTime(time));
    }
}
