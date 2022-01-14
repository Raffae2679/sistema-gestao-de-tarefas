package br.com.sistematarefas.Sistemadetarefas.beans;


import br.com.sistematarefas.Sistemadetarefas.modelo.Tarefa;
import br.com.sistematarefas.Sistemadetarefas.repository.TarefaRepository;
import lombok.Getter;
import lombok.Setter;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@Named(value = "tarefaMB")
@ViewScoped
public class TarefaMB {


    @Getter
    @Setter
    private List<Tarefa> tarefas = new ArrayList<>();

    @Getter
    @Setter
    private List<Tarefa> tarefasGeral = new ArrayList<>();

    @Getter
    @Setter
    private Tarefa tarefa =  new Tarefa();



    @Autowired
    private TarefaRepository tarefaRepository;


    public List<Tarefa> listarTodas() {
        tarefas = new ArrayList<>();
        tarefasGeral = tarefaRepository.findAll();

        int tam = tarefasGeral.size();

        for (int i=0; i<tam;i++){

            if(tarefasGeral.get(i).getConfirmacao()!= true){
                System.out.println(tarefasGeral.get(i).getTitulo());
                tarefas.add(tarefasGeral.get(i));
            }
        }

        return tarefas;
    }

    public List<Tarefa> listarConcluidas() {
        tarefas = new ArrayList<>();
        tarefasGeral = tarefaRepository.findAll();

        int tam = tarefasGeral.size();

        for (int i=0; i<tam;i++){

            if(tarefasGeral.get(i).getConfirmacao()!= false){
                System.out.println(tarefasGeral.get(i).getTitulo());
                tarefas.add(tarefasGeral.get(i));
            }
        }

        return tarefas;
    }


    @PostMapping
    public void incluir(){
        tarefa.setId(1L);
        //System.out.println("Entrou aq");
        //System.out.println(tarefa);
        tarefaRepository.save(tarefa);

        tarefa = new Tarefa();

        //System.out.println(tarefa);
        //tarefas = tarefaRepository.findAll();

    }

    @PutMapping
    public  String atualizar(Tarefa tarefa){
        tarefaRepository.save(tarefa);

        return "tarefas.xhtml?faces-redirect=true";
    }

    @DeleteMapping
    public void apagar(Tarefa tarefa){
        tarefaRepository.delete(tarefa);
        tarefas = tarefaRepository.findAll();
    }

    public String editar(Long id){
        tarefa = tarefaRepository.getById(id);

        return "editar-tarefa.xhtml?faces-redirect=true";
    }

    public String novo() {
        tarefa = new Tarefa();

        return "criar-tarefa.xhtml?faces-redirect=true";
    }

    public String concluir(Tarefa tarefa){
        tarefa.setStatus("Concluido");
        tarefa.verdade();
        tarefaRepository.save(tarefa);

        tarefas = tarefaRepository.findAll();

        return "tarefas.xhtml?faces-redirect=true";
    }





}

