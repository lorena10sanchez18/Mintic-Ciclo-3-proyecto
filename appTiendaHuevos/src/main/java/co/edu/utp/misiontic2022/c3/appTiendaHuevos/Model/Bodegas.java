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
@Table(name = "bodegas", indexes = {@Index(columnList = "descripcion_bodegas")})
public class Bodegas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bodega",  nullable = false, unique = true)
    private Integer idBodega;

    @Column(name = "descripcion_bodegas",  nullable = false,  length = 45, unique = true)
    private String descripcion;

    public Bodegas(String descripcion) {
        this.descripcion = descripcion;
    }
}
