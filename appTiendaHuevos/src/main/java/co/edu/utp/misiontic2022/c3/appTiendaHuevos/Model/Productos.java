package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "productos", indexes = {@Index(columnList = "descripcion")})
public class Productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto",  nullable = false, unique = true)
    private Integer idProducto;

    @Column(name = "descripcion",  nullable = false,  length = 45, unique = true)
    private String descripcion;

    public Productos(String descripcion) {
        this.descripcion = descripcion;
    }

}
