package br.com.sistematarefas.Sistemadetarefas.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "TB_Tarefa")
@Table(name = "TB_Tarefa")
public class Tarefa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String titulo;

    @Column
    private String descricao;

    @Column
    private String responsavel;

    @Column
    private String prioridade;

    @Column
    private String deadline;


    @Column(columnDefinition="varchar(50) default 'same one value'")
    private String status;

    @Column
    private Boolean confirmacao;

    @PrePersist
    public void prePersist() {
        if(status == null){
            status = "Em andamento";
        }

        if(confirmacao == null){
            confirmacao = false;
        }
    }

    public void verdade(){
        confirmacao = true;
    }


}
