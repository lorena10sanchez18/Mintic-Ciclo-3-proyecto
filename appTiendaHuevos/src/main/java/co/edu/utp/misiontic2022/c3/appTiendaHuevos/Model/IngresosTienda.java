package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "ingresos_tienda")

public class IngresosTienda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ingreso_tienda",  nullable = false, unique = true)
    private Integer idIngresoTienda;

    @Column(name = "fecha",  nullable = false,  length = 15)
    private String fecha;

    @Column(name = "cantidad",  nullable = false)
    private Integer cantidad;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="id_producto")
    private Productos idProducto;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="id_ubicacion")
    private Ubicaciones idUbicacion;

}
