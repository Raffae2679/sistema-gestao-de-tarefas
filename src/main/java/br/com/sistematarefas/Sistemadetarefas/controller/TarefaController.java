package br.com.sistematarefas.Sistemadetarefas.controller;

import br.com.sistematarefas.Sistemadetarefas.modelo.Tarefa;
import br.com.sistematarefas.Sistemadetarefas.repository.TarefaRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tarefas")
@Api(value = "API Gestão de tarefas")
@CrossOrigin(origins = "*")
public class TarefaController {

    @Autowired
    private TarefaRepository tarefaRepository;

    @GetMapping
    @ApiOperation(value="Retorna uma lista de tarefas")
    public List<Tarefa> listar(){
        return tarefaRepository.findAll();
    }

    @PostMapping
    @ApiOperation(value="Cadastra uma tarefa")
    @ResponseStatus(HttpStatus.CREATED)
    public Tarefa adicionar(@RequestBody Tarefa tarefa){
        return tarefaRepository.save(tarefa);
    }

    @PutMapping
    @ApiOperation(value="Atualiza uma tarefa")
    public Tarefa alterar(@RequestBody Tarefa tarefa){
        return tarefaRepository.save(tarefa);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value="Deleta uma tarefa")
    public void deletar(@PathVariable Long id){
        tarefaRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    @ApiOperation(value="Retorna uma tarefa unica")
    public Optional<Tarefa> buscar(@PathVariable Long id){
        return tarefaRepository.findById(id);
    }


}
