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
    @JoinColumn(name="descripcion")
    private Productos descripcionProducto;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="posicion")
    private Ubicaciones posicionUbicaciones;

    public IngresosTienda(String fecha, Integer cantidad, Productos descripcionProducto, Ubicaciones posicionUbicaciones) {
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.descripcionProducto = descripcionProducto;
        this.posicionUbicaciones = posicionUbicaciones;
    }
}
