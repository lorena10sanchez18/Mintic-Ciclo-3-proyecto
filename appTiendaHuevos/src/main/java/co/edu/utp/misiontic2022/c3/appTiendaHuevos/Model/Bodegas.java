package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "bodegas")
public class Bodegas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bodega",  nullable = false, unique = true)
    private Integer idBodega;

    @Column(name = "descripcion",  nullable = false,  length = 45)
    private String descripcion;

    public Bodegas(String descripcion) {
        this.descripcion = descripcion;
    }
}
