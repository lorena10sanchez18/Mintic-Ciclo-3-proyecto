package co.edu.utp.misiontic2022.c3.appTiendaHuevos.Controller;

import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Model.Usuarios;
import co.edu.utp.misiontic2022.c3.appTiendaHuevos.Services.UsuariosServices;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
@CrossOrigin(origins = "http://localhost:4200")
public class UsuariosController {
    private final UsuariosServices usuariosServices;

    public UsuariosController(UsuariosServices usuariosServices) {
        this.usuariosServices = usuariosServices;
    }

    @GetMapping("/usuario-cedula/{cedula}")
    public ResponseEntity<Usuarios> buscarUsuarioPorCedula(@PathVariable Integer cedula) {
        return new ResponseEntity<>(
                usuariosServices.buscarUsuarioPorCedula(cedula),
                HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<Usuarios> ingresoAplicacion(@RequestBody JsonNode body) {
        return new ResponseEntity<>(
                usuariosServices.buscarRol(
                        body.get("usuario").asInt(),
                        body.get("contrasenia").asText()),
                HttpStatus.OK);
    }
}
