package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Controller;

import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Model.Usuarios;
import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Services.UsuariosServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class UsuariosController {
    private final UsuariosServices usuariosServices;

    public UsuariosController(UsuariosServices usuariosServices) {
        this.usuariosServices = usuariosServices;
    }

    @GetMapping("/usuario-cedula/{cedula}")
    public ResponseEntity<Usuarios> buscarUsuarioPorCedula(@PathVariable Integer cedula){
        Usuarios usuario = usuariosServices.buscarUsuarioPorCedula(cedula);
        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }
}
