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
@Table(name = "ingresos_tienda")

public class IngresosTienda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ingreso_tienda",  nullable = false, unique = true)
    private Integer idIngresoTienda;

    @Column(name = "fecha",  nullable = false,  length = 15)
    private Date fecha;

    @Column(name = "cantidad",  nullable = false)
    private Integer cantidad;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="id_productos")
    private Productos descripcionProducto;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="id_ubicacion")
    private Ubicaciones posicion;

    public IngresosTienda(Date fecha, Integer cantidad, Productos descripcionProducto, Ubicaciones posicionUbicaciones) {
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.descripcionProducto = descripcionProducto;
        this.posicion = posicionUbicaciones;
    }
}
