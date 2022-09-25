package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "fieldHandler"})
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
    private Date fecha;

    @Column(name = "cantidad",  nullable = false)
    private Integer cantidad;

    @Column(name = "valor_unitario",  nullable = false)
    private Double valorUnitario;


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="id_productos")
    private Productos descripcionProductos;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="id_ubicacion")
    private Ubicaciones posicion;

    public IngresosBodega(String factura, String observaciones, Date fecha, Integer cantidad, Double valorUnitario, Productos descripcionProducto, Ubicaciones posicionUbicaciones) {
        this.factura = factura;
        this.observaciones = observaciones;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.valorUnitario = valorUnitario;
        this.descripcionProductos = descripcionProducto;
        this.posicion = posicionUbicaciones;
    }
}
