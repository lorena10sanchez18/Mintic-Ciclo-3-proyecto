package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "ingresos_bodega")

public class IngresosBodega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ingreso_bodega",  nullable = false, unique = true)
    private Integer idIngresoBodega;

    @Column(name = "factura",  nullable = false,  length = 20)
    private String factura;

    @Column(name = "observaciones",  nullable = false,  length = 200)
    private String observaciones;

    @Column(name = "fecha",  nullable = false,  length = 15)
    private String fecha;

    @Column(name = "cantidad",  nullable = false)
    private Integer cantidad;

    @Column(name = "valor_unitario",  nullable = false)
    private Double valorUnitario;


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="descripcion")
    private Productos descripcionProducto;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="posicion")
    private Ubicaciones posicionUbicaciones;

    public IngresosBodega(String factura, String observaciones, String fecha, Integer cantidad, Double valorUnitario, Productos descripcionProducto, Ubicaciones posicionUbicaciones) {
        this.factura = factura;
        this.observaciones = observaciones;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.valorUnitario = valorUnitario;
        this.descripcionProducto = descripcionProducto;
        this.posicionUbicaciones = posicionUbicaciones;
    }
}