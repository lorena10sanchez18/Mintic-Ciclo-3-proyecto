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
@Table(name = "ventas")
public class Ventas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venta",  nullable = false, unique = true)
    private Integer idVenta;

    @Column(name = "fecha",  nullable = false,  length = 50)
    private Date fecha;

    @Column(name = "cantidad",  nullable = false)
    private Integer cantidad;

    @Column(name = "valor_total",  nullable = false)
    private Double valorTotal;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="id_producto")
    private Productos descripcionProducto;

    public Ventas(Date fecha, Integer cantidad, Double valorTotal, Productos descripcionProducto) {
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.valorTotal = valorTotal;
        this.descripcionProducto = descripcionProducto;
    }
}
