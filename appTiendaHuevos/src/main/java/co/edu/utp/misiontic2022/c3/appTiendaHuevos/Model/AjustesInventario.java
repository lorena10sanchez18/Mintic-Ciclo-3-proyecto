package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "ajustes_inventario")
public class AjustesInventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ajuste_inventario",  nullable = false, unique = true)
    private Integer idAjusteInventario;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="descripcion")
    private Productos descripcionProducto;

    @Column(name = "fecha",  nullable = false,  length = 15)
    private String fecha;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="descripcion")
    private Bodegas descripcionBodega;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="descripcion")
    private Motivos desctipcionMotivo;

    @Column(name = "cantidad",  nullable = false)
    private Integer cantidad;

    @Column(name = "observaciones",  nullable = false,  length = 200)
    private String observaciones;

    public AjustesInventario(Productos descripcionProducto, String fecha, Bodegas descripcionBodega, Motivos desctipcionMotivo, Integer cantidad, String observaciones) {
        this.descripcionProducto = descripcionProducto;
        this.fecha = fecha;
        this.descripcionBodega = descripcionBodega;
        this.desctipcionMotivo = desctipcionMotivo;
        this.cantidad = cantidad;
        this.observaciones = observaciones;
    }
}
