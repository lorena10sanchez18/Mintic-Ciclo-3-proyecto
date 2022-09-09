package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
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

    public Usuarios(Integer cedula, String contrasenia, String rol) {
        this.cedula = cedula;
        this.contrasenia = contrasenia;
        this.rol = rol;
    }
}
