package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "traslados")

public class Traslados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_traslado",  nullable = false, unique = true)
    private Integer idTraslado;

    @Column(name = "fecha",  nullable = false,  length = 15)
    private String fecha;

    @Column(name = "cantidad",  nullable = false)
    private Integer cantidad;

    @Column(name = "observaciones",  nullable = false,  length = 200)
    private String observaciones;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="descripcion")
    private Productos descripcionProducto;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="descripcion")
    private Bodegas descripcionOrigen;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="descripcion")
    private Bodegas descripcionDestino;

    public Traslados(String fecha, Integer cantidad, String observaciones, Productos descripcionProducto, Bodegas descripcionOrigen, Bodegas descripcionDestino) {
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.observaciones = observaciones;
        this.descripcionProducto = descripcionProducto;
        this.descripcionOrigen = descripcionOrigen;
        this.descripcionDestino = descripcionDestino;
    }
}
