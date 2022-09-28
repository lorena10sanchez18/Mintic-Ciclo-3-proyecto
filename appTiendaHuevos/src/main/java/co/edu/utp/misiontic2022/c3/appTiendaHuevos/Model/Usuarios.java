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
@Table(name = "usuarios", indexes = {@Index(columnList = "cedula")})
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario",  nullable = false, unique = true)
    private Integer idUsuario;

    @Column(name = "cedula",  nullable = false, unique = true)
    private Integer cedula;

    @Column(name = "contrasenia",  nullable = false, length = 50)
    private String contrasenia;

    @Column(name = "rol",  nullable = false, length = 20)
    private String rol;

    @Column(name = "estado",  nullable = false, length = 10)
    private String estado;

    @Column(name = "nombre",  nullable = false, length = 45)
    private String nombre;

    public Usuarios(Integer cedula, String contrasenia, String rol, String estado, String nombre) {
        this.cedula = cedula;
        this.contrasenia = contrasenia;
        this.rol = rol;
        this.estado = estado;
        this.nombre = nombre;
    }
}
