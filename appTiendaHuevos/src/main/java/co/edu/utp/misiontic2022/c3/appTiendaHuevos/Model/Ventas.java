package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "ventas")
public class Ventas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venta",  nullable = false, unique = true)
    private Integer idVenta;

    @Column(name = "fecha",  nullable = false,  length = 15)
    private String fecha;

    @Column(name = "cantidad",  nullable = false)
    private Integer cantidad;

    @Column(name = "valor_total",  nullable = false)
    private Double valorTotal;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="id_producto")
    private Productos idProducto;

    public Ventas(String fecha, Integer cantidad, Double valorTotal, Productos idProducto) {
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.valorTotal = valorTotal;
        this.idProducto = idProducto;
    }
}
