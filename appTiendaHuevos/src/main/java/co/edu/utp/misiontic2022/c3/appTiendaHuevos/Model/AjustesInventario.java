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
@Table(name = "ajustes_inventario")
public class AjustesInventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ajuste_inventario",  nullable = false, unique = true)
    private Integer idAjusteInventario;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="id_productos")
    private Productos descripcionProductos;

    @Column(name = "fecha",  nullable = false,  length = 15)
    private Date fecha;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="id_bodega")
    private Bodegas descripcionBodega;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="id_motivos")
    private Motivos desctipcionMotivo;

    @Column(name = "cantidad",  nullable = false)
    private Integer cantidad;

    @Column(name = "observaciones",  nullable = false,  length = 200)
    private String observaciones;

    public AjustesInventario(Productos descripcionProducto, Date fecha, Bodegas descripcionBodega, Motivos desctipcionMotivo, Integer cantidad, String observaciones) {
        this.descripcionProductos = descripcionProducto;
        this.fecha = fecha;
        this.descripcionBodega = descripcionBodega;
        this.desctipcionMotivo = desctipcionMotivo;
        this.cantidad = cantidad;
        this.observaciones = observaciones;
    }
}
