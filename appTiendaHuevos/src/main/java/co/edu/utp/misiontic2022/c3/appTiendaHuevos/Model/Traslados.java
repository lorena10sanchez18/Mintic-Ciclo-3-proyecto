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
@Table(name = "traslados")

public class Traslados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_traslado",  nullable = false, unique = true)
    private Integer idTraslado;

    @Column(name = "fecha",  nullable = false,  length = 15)
    private Date fecha;

    @Column(name = "cantidad",  nullable = false)
    private Integer cantidad;

    @Column(name = "observaciones",  nullable = false,  length = 200)
    private String observaciones;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="id_productos")
    private Productos descripcionProducto;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="id_bodegas")
    private Bodegas descripcionOrigen;

//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name="id_bodegas")
//    private Bodegas descripcionDestino;

    public Traslados(Date fecha, Integer cantidad, String observaciones, Productos descripcionProducto, Bodegas descripcionOrigen) {//, Bodegas descripcionDestino
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.observaciones = observaciones;
        this.descripcionProducto = descripcionProducto;
        this.descripcionOrigen = descripcionOrigen;
//        this.descripcionDestino = descripcionDestino;
    }
}
