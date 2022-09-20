package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "fieldHandler"})
@Table(name = "motivos", indexes = {@Index(columnList = "descripcion_motivos")})
public class Motivos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_motivo",  nullable = false, unique = true)
    private Integer idMotivo;

    @Column(name = "descripcion_motivos",  nullable = false,  length = 45, unique = true)
    private String descripcion;

    public Motivos(String descripcion) {
        this.descripcion = descripcion;
    }
}
