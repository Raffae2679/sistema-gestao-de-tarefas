package br.com.sistematarefas.Sistemadetarefas.repository;

import br.com.sistematarefas.Sistemadetarefas.modelo.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Long> {

    @Query("select titulo,descricao,responsavel,deadline,status,prioridade from TB_Tarefa where status=:status")
    public List<Tarefa> buscarTarefa(@Param("status") String status);
}
