package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "ubicaciones", indexes = {@Index(columnList = "posicion")})
public class Ubicaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ubicacion",  nullable = false, unique = true)
    private Integer idUbicacion;

    @Column(name = "posicion",  nullable = false,  length = 45, unique = true)
    private String posicion;

    public Ubicaciones(String posicion) {
        this.posicion = posicion;
    }
}
