package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "fieldHandler"})
@Table(name = "productos", indexes = {@Index(columnList = "descripcion_productos")})
public class Productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto",  nullable = false, unique = true)
    private Integer idProducto;

    @Column(name = "descripcion_productos",  nullable = false,  length = 45, unique = true,insertable= false, updatable= false)
    private String descripcionProductos;

    @Column(name = "valor_venta", nullable = false)
    private Double valorVenta;

    public Productos(String descripcionProductos, Double valorVenta) {
        this.descripcionProductos = descripcionProductos;
        this.valorVenta = valorVenta;
    }
}
