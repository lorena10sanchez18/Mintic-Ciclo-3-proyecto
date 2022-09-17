package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "bodegas", indexes = {@Index(columnList = "descripcion")})
public class Bodegas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bodega",  nullable = false, unique = true)
    private Integer idBodega;

    @Column(name = "descripcion",  nullable = false,  length = 45, unique = true)
    private String descripcion;

    public Bodegas(String descripcion) {
        this.descripcion = descripcion;
    }
}
